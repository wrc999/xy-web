package wrc.xy.controller;


import java.io.Serializable;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wrc.xy.entity.suggest;
import wrc.xy.entity.userinfo;
import wrc.xy.service.user.userService;
import wrc.xy.util.MD5Utils;


@RestController
@RequestMapping("/user")
public class user {

	@Autowired
	private userService us;
	
	//添加用户
	@RequestMapping("/add")
	public  String add(userinfo user) throws SQLException{
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		user.setRegisterTime(df.format(new Date()));
		user.setPassWord(MD5Utils.md5(user.getPassWord()));
		us.userAdd(user);
		return "1";
	}
	
	@RequestMapping("/suggestAdd")
	public  String add(suggest suggest) throws SQLException {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String suggesttime = df.format(new Date());
		suggest.setSuggesttime(suggesttime);
		us.userSuggestAdd(suggest);
		return "1";
	}
	
	//删除用户接口
	@RequestMapping("/delete")
	public  String delete(userinfo user) throws SQLException{
		us.userDel(user);
		return "1";
	}
	
	//修改用户接口
	@RequestMapping("/edit")
	public  userinfo edit(userinfo user) throws SQLException{
		return us.userUpdate(user);
	}
	
	//查询用户接口
	@RequestMapping("/login")
	public  userinfo login(userinfo user){
		if(user.getPassWord()!=null && user.getPassWord()!="") {
			user.setPassWord(MD5Utils.md5(user.getPassWord()));
		}
		return us.login(user);
	}
	
	//修改密码接口
	@RequestMapping("/changePassWord")
	public  String changePassWord(userinfo user){
		userinfo u = us.userGet(user);
		user.setPassWord(MD5Utils.md5(user.getPassWord()));
		//如果原密码相同，则修改密码，否则返回“error"
		if(u.getPassWord().equals(user.getPassWord())) {
			user.setNewPassWord(MD5Utils.md5(user.getNewPassWord()));
			us.changePassWord(user);
			return "1";
		}
		return "error";
	}
	
	//后台查询用户接口
	@RequestMapping("/adminGetSuggest")
	public  Map<String, Serializable> adminGetSuggest(suggest suggest,String limit,String page){
		int pageSize = 10;
		if(limit != null && !limit.equals("")){
			pageSize = Integer.parseInt(limit);
		}
		int page1 = 1;
		if(page != null && !page.equals("")){
			page1 = Integer.parseInt(page);
		}
		ArrayList<suggest> suggestList = (ArrayList<suggest>) us.adminGetSuggest(suggest);
		int total = suggestList.size();
		ArrayList<suggest> suggestList1 = new ArrayList<suggest>();
		Map<String, Serializable> resultMap = new HashMap<String, Serializable>();
		resultMap.put("count", total);
		resultMap.put("msg", "");
		resultMap.put("code", 0);
		if(page != null && page.length() > 0 && limit!=null && limit.length()>0){
			for(int i = (page1-1)*pageSize ; i< page1*pageSize && i< total;i++){
				suggestList1.add(suggestList.get(i));
			}
			resultMap.put("data", suggestList1);
			return resultMap;
		}else{
			resultMap.put("data", suggestList);
			return resultMap;
		}
	}
	//后台查询用户接口
	@RequestMapping("/adminGet")
	public  Map<String, Serializable> adminGet(userinfo user,String limit,String page){
		int pageSize = 10;
		if(limit != null && !limit.equals("")){
			pageSize = Integer.parseInt(limit);
		}
		int page1 = 1;
		if(page != null && !page.equals("")){
			page1 = Integer.parseInt(page);
		}
		ArrayList<userinfo> userList = (ArrayList<userinfo>) us.userAdminGet(user);
		int total = userList.size();
		ArrayList<userinfo> userList1 = new ArrayList<userinfo>();
		Map<String, Serializable> resultMap = new HashMap<String, Serializable>();
		resultMap.put("count", total);
		resultMap.put("msg", "");
		resultMap.put("code", 0);
		if(page != null && page.length() > 0 && limit!=null && limit.length()>0){
			for(int i = (page1-1)*pageSize ; i< page1*pageSize && i< total;i++){
				userList1.add(userList.get(i));
			}
			resultMap.put("data", userList1);
			return resultMap;
		}else{
			resultMap.put("data", userList);
			return resultMap;
		}
	}
}
