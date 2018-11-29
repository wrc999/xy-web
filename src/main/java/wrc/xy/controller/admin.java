package wrc.xy.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import wrc.xy.entity.activity;
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
	public  String add(userinfo info,HttpServletRequest request) throws Exception {
		if(info.getPassWord()!=null && info.getPassWord()!="") {
			info.setPassWord(MD5Utils.md5(info.getPassWord()));
		}
		String account = ads.login(info);
		if(account!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("account", account);
		}
		return account;
	}
	@RequestMapping("quit")
	public  void quit(HttpSession session) throws Exception {
		session.removeAttribute("account");
	}
	
	@RequestMapping("add")
	public  void add(adminLog info) throws Exception {
		info.setCreateTime(DateUtil.getCurrentTime());
		ads.adminLogAdd(info);
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
