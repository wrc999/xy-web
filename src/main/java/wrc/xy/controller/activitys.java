package wrc.xy.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wrc.xy.entity.activity;
import wrc.xy.entity.activityjoins;
import wrc.xy.entity.activitypraise;
import wrc.xy.entity.userinfo;
import wrc.xy.service.activity.activityService;
import wrc.xy.util.DateUtil;



@RestController//包含@Controller和@ResponseBody
@RequestMapping("activity")
public class activitys {

	@Autowired
	private activityService as;
	
	//活动报名
	@RequestMapping("joinsAdd")
	public  String joinsAdd(activityjoins ajoins) {
		as.joinsAdd(ajoins);
		return "1";
	}
	//活动取消报名
	@RequestMapping("joinsDelete")
	public  String joinsDelete(activityjoins ajoins) {
		as.joinsDelete(ajoins);
		return "1";
	}
	//活动点赞
	@RequestMapping("praiseAdd")
	public  int praiseAdd(activitypraise praise) {
		return as.praiseAdd(praise);
	}
	//活动取消报名
	@RequestMapping("praiseDelete")
	public  int praiseDelete(activitypraise praise) {
		return as.praiseDelete(praise);
	}
	//添加活动
	@RequestMapping("add")
	public  String add(activity activity) throws Exception {
		activity.setCreateTime(DateUtil.getCurrentTime());
		as.add(activity);
		return "1";
	}
	
	//添加活动
	@RequestMapping("edit")
	public  String edit(activity activity) {
		as.edit(activity);
		return "1";
	}

	//删除活动
	@RequestMapping("delete")
	public  String delete(activity activity) {
		as.delete(activity);
		return "1";
	}
	//查询所有未审核的活动
	@RequestMapping("getExamine")
	public  List<activity> getExamine(Integer online) {
		return as.getExamine(online);
	}
	//查询所有审核不通过的活动
	@RequestMapping("getFalseExamine")
	public  List<activity> getFalseExamine(Integer online) {
		return as.getFalseExamine(online);
	}
	//查询所有线上活动
	@RequestMapping("getOnLine")
	public  List<activity> getOnLine(String account) {
		return as.getOnLine(account);
	}
	//查询所有线下活动
	@RequestMapping("getUnderLine")
	public  List<activity> getUnderLine(String account) {
		return as.getUnderLine(account);
	}
	//根据用户账号查询
	@RequestMapping("getByAccount")
	public  List<activity> getByAccount(String account) {
		return as.getByAccount(account);
	}
	//根据活动id查询
	@RequestMapping("getByActivityId")
	public  activity getByActivityId(Integer activity_id) {
		return as.getByActivityId(activity_id);
	}
	//搜索活动
	@RequestMapping("activitySearch")
	public  List<activity> activitySearch(String name) {
		return as.activitySearch(name);
	}
	
	//根据活动id查询报名名单
	@RequestMapping("getActivityJoins")
	public List<userinfo> getActivityJoins(Integer activity_id) {
		return as.getActivityJoins(activity_id);
	}
	
	//后台查询所有活动
	@RequestMapping("adminGet")
	public  Map<String, Serializable> adminGet(String account,String limit,String page){
		int pageSize = 10;
		if(limit != null && !limit.equals("")){
			pageSize = Integer.parseInt(limit);
		}
		int page1 = 1;
		if(page != null && !page.equals("")){
			page1 = Integer.parseInt(page);
		}
		ArrayList<activity> activityList = (ArrayList<activity>) as.getByAccount(account);
		int total = activityList.size();
		ArrayList<activity> activityList1 = new ArrayList<activity>();
		Map<String, Serializable> resultMap = new HashMap<String, Serializable>();
		resultMap.put("count", total);
		resultMap.put("msg", "");
		resultMap.put("code", 0);
		if(page != null && page.length() > 0 && limit!=null && limit.length()>0){
			for(int i = (page1-1)*pageSize ; i< page1*pageSize && i< total;i++){
				activityList1.add(activityList.get(i));
			}
			resultMap.put("data", activityList1);
			return resultMap;
		}else{
			resultMap.put("data", activityList);
			return resultMap;
		}
	}
	//后台查询所有活动
	@RequestMapping("adminGetExamine")
	public  Map<String, Serializable> adminGetExamine(String name,String limit,String page){
		int pageSize = 10;
		if(limit != null && !limit.equals("")){
			pageSize = Integer.parseInt(limit);
		}
		int page1 = 1;
		if(page != null && !page.equals("")){
			page1 = Integer.parseInt(page);
		}
		ArrayList<activity> activityList = (ArrayList<activity>) as.getAdminExamine(name);
		int total = activityList.size();
		ArrayList<activity> activityList1 = new ArrayList<activity>();
		Map<String, Serializable> resultMap = new HashMap<String, Serializable>();
		resultMap.put("count", total);
		resultMap.put("msg", "");
		resultMap.put("code", 0);
		if(page != null && page.length() > 0 && limit!=null && limit.length()>0){
			for(int i = (page1-1)*pageSize ; i< page1*pageSize && i< total;i++){
				activityList1.add(activityList.get(i));
			}
			resultMap.put("data", activityList1);
			return resultMap;
		}else{
			resultMap.put("data", activityList);
			return resultMap;
		}
	}
}
