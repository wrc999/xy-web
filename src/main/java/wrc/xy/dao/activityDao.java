package wrc.xy.dao;

import java.util.List;

import wrc.xy.entity.activity;
import wrc.xy.entity.activityjoins;
import wrc.xy.entity.activitypraise;


public interface activityDao {
		public void add(activity activity);						//添加果断
		public void delete(activity activity);					//删除活动
		public List<activity> getByAccount(String account);					//根据用户id查询活动
		public activity getByactivityId(Integer activity_id);					//查询活动id活动
		public List<activity> activitySearch(String name);					//查询活动id活动
		public void joinsAdd(activityjoins a);					//添加报名者
		public List<activityjoins> joinsGet(Integer activity_id);					//获取报名者
		public void joinsDelete(activityjoins ajoins);
		public void praiseAdd(activitypraise a);					//添加点赞
		public List<activitypraise> praiseGet(Integer activity_id);					//获取点赞名单
		public void praiseDelete(activitypraise praise);
		public List<activity> getOnLine(String account);
		public List<activity> getUnderLine(String account);
		public List<activity> getExamine(Integer online);//获取待审核
		public List<activity> getFalseExamine(Integer online);//获取未审核
		public void edit(activity activity);
}
