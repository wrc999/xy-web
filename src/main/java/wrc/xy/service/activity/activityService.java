package wrc.xy.service.activity;

import java.util.List;

import wrc.xy.entity.activity;
import wrc.xy.entity.activityjoins;
import wrc.xy.entity.activitypraise;
import wrc.xy.entity.userinfo;


public interface activityService {
	
	public void add(activity activity);						//添加活动
	public void delete(activity activity);					//删除活动
	public List<activity> getByAccount(String account);					//查询活动
	public void joinsAdd(activityjoins a);					//添加报名者
	public void joinsDelete(activityjoins ajoins);
	public List<userinfo> getActivityJoins(Integer activity_id);
	public void praiseAdd(activitypraise a);					//添加报名者
	public void praiseDelete(activitypraise praise);
	public activity getByActivityId(Integer activity_id);
	public List<activity> activitySearch(String name);
	public List<activity> getOnLine(String account);
	public List<activity> getUnderLine(String account);
	public List<activity> getExamine(Integer online);
	public List<activity> getFalseExamine(Integer online);
	public void edit(activity activity);
}
