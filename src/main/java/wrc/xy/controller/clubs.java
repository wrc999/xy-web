package wrc.xy.controller;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wrc.xy.entity.club;
import wrc.xy.entity.clubfocus;
import wrc.xy.entity.clubmember;
import wrc.xy.service.club.clubService;
import wrc.xy.util.DateUtil;

@RestController
@RequestMapping("club")
public class clubs {

	@Autowired
	public clubService cs;
	
	@RequestMapping("add")
	public  String add(club club) throws Exception {
		club.setCreateTime(DateUtil.getCurrentTime());
		cs.clubAdd(club);
		return "1";
	}
	@RequestMapping("edit")
	public  String edit(club club) throws Exception {
		cs.clubEdit(club);
		return "1";
	}
	@RequestMapping("changeOwner")
	public  String changeOwner(club c) throws Exception {
		cs.changeOwner(c);
		return "1";
	}
	@RequestMapping("delete")
	public  String delete(club club) throws Exception {
		cs.clubDelete(club);
		return "1";
	}
	@RequestMapping("get")
	public  ArrayList<club> get(club club) throws Exception {
		return cs.clubGet(club);
	}
	@RequestMapping("findById")
	public  club findById(club club) throws Exception {
		return cs.findById(club);
	}
	@RequestMapping("findByAccount")
	public  ArrayList<club> findByAccount(String account) throws Exception {
		return cs.findByAccount(account);
	}
	@RequestMapping("search")
	public  ArrayList<club> search(club club) throws Exception {
		return cs.clubSearch(club);
	}
	@RequestMapping("join")
	public  String join(clubmember member) throws Exception {
		member.setJoinTime(DateUtil.getCurrentTime());
		cs.clubJoin(member);
		//返回加入的社团群聊id
		club temp = new club();
		temp.setClub_id(member.getClub_id());
		club club = cs.findById(temp);
		return club.getGroupId();
	}
	@RequestMapping("quit")
	public  String quit(clubmember member) throws Exception {
		cs.clubQuit(member);
		return "1";
	}
	@RequestMapping("findMyFocus")
	public  ArrayList<club> findMyFocus(String account) throws Exception {
		return cs.findMyFocus(account);
	}
	@RequestMapping("focus")
	public  String focus(clubfocus focus) throws Exception {
		cs.focus(focus);
		return "1";
	}
	@RequestMapping("unfocus")
	public  String unfocus(clubfocus focus) throws Exception {
		cs.unfocus(focus);
		return "1";
	}
	
	//后台查询所有社团接口
	@RequestMapping("/adminGet")
	public  Map<String, Serializable> adminGet(club club,String limit,String page) throws SQLException{
		int pageSize = 10;
		if(limit != null && !limit.equals("")){
			pageSize = Integer.parseInt(limit);
		}
		int page1 = 1;
		if(page != null && !page.equals("")){
			page1 = Integer.parseInt(page);
		}
		ArrayList<club> clubList = (ArrayList<club>) cs.clubGet(club);
		int total = clubList.size();
		ArrayList<club> clubList1 = new ArrayList<club>();
		Map<String, Serializable> resultMap = new HashMap<String, Serializable>();
		resultMap.put("count", total);
		resultMap.put("msg", "");
		resultMap.put("code", 0);
		if(page != null && page.length() > 0 && limit!=null && limit.length()>0){
			for(int i = (page1-1)*pageSize ; i< page1*pageSize && i< total;i++){
				clubList1.add(clubList.get(i));
			}
			resultMap.put("data", clubList1);
			return resultMap;
		}else{
			resultMap.put("data", clubList);
			return resultMap;
		}
	}
	
	//后台查询所有社团接口
	@RequestMapping("/adminGetExamine")
	public  Map<String, Serializable> adminGetExamine(club club,String limit,String page) throws SQLException{
		int pageSize = 10;
		if(limit != null && !limit.equals("")){
			pageSize = Integer.parseInt(limit);
		}
		int page1 = 1;
		if(page != null && !page.equals("")){
			page1 = Integer.parseInt(page);
		}
		ArrayList<club> clubList = (ArrayList<club>) cs.adminGetExamine(club);
		int total = clubList.size();
		ArrayList<club> clubList1 = new ArrayList<club>();
		Map<String, Serializable> resultMap = new HashMap<String, Serializable>();
		resultMap.put("count", total);
		resultMap.put("msg", "");
		resultMap.put("code", 0);
		if(page != null && page.length() > 0 && limit!=null && limit.length()>0){
			for(int i = (page1-1)*pageSize ; i< page1*pageSize && i< total;i++){
				clubList1.add(clubList.get(i));
			}
			resultMap.put("data", clubList1);
			return resultMap;
		}else{
			resultMap.put("data", clubList);
			return resultMap;
		}
	}
	
}
