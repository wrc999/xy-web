package wrc.xy.controller;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import wrc.xy.entity.activity;
import wrc.xy.entity.adminAccount;
import wrc.xy.entity.adminInfo;
import wrc.xy.entity.adminLog;
import wrc.xy.entity.club;
import wrc.xy.entity.userinfo;
import wrc.xy.service.activity.activityService;
import wrc.xy.service.admin.adminService;
import wrc.xy.service.club.clubService;
import wrc.xy.service.user.userService;
import wrc.xy.util.DateUtil;
import wrc.xy.util.MD5Utils;

@RestController//包含@Controller和@ResponseBody
@RequestMapping("admin")
public class admin {
	
	@Autowired
	private activityService as;
	@Autowired
	public clubService cs;
	@Autowired
	private userService us;
	@Autowired
	private adminService ads;
	
	@RequestMapping("login")
	public  adminAccount add(adminAccount info,HttpServletRequest request) throws Exception {
		if(info.getPassWord()!=null && info.getPassWord()!="") {
			info.setPassWord(MD5Utils.md5(info.getPassWord()));
		}
		adminAccount user = ads.login(info);
		if(user!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("account", user.getAccount());
		}
		return user;
	}
	@RequestMapping("quit")
	public  void quit(HttpSession session) throws Exception {
		session.removeAttribute("account");
	}
	
	//添加日志
	@RequestMapping("add")
	public  void add(adminLog info) throws Exception {
		info.setCreateTime(DateUtil.getCurrentTime());
		ads.adminLogAdd(info);
	}
	
	//添加用户
	@RequestMapping("/adminAdd")
	public  String adminAdd(adminAccount admin) throws SQLException{
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		admin.setCreateTime(df.format(new Date()));
		admin.setPassWord(MD5Utils.md5(admin.getPassWord()));
		adminAccount adminAccount = ads.adminGetByAccount(admin.getApplyAccount());
		if(adminAccount!=null && adminAccount.getPower().equals("super")) {
			ads.adminAdd(admin);
			return "1";
		}else {
			return "2";
		}
	}
	
	@RequestMapping("getLog")
	public  ArrayList<adminLog> getLog() throws Exception {
		return ads.adminLogSelect();
	}
	
	//获取统计
	@RequestMapping("get")
	public  adminInfo get() throws Exception {
		int allClub,allActivity,allUser,examineClub = 0,examineActivity = 0;
		ArrayList<activity> activityList = (ArrayList<activity>) as.getByAccount(null);
		allActivity = activityList.size();
		for(activity a:activityList) {
			//待审核
			if(a.getActivityPass()==0) {
				examineActivity++;
			}
		}
		ArrayList<club> clubList = cs.clubGet(null);
		allClub = clubList.size();
		for(club a:clubList) {
			//待审核
			if(a.getClubPass()==0) {
				examineClub++;
			}
		}
		ArrayList<userinfo> userList = us.userAdminGet(null);
		allUser = userList.size();
		ArrayList<adminLog> adminLogs = ads.adminLogSelect();
		adminInfo info = new adminInfo();
		info.setAllClub(allClub);
		info.setExamineClub(examineClub);
		info.setAllUser(allUser);
		info.setAllActivity(allActivity);
		info.setExamineActivity(examineActivity);
		info.setAdminLogs(adminLogs);
		return info;
	}
}
