package wrc.xy.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import wrc.xy.entity.praise;
import wrc.xy.entity.replytalk;
import wrc.xy.entity.talk;
import wrc.xy.entity.topic;



public interface talkDao {
	
	  public ArrayList<talk> talkSelect(talk talk) throws SQLException, ClassNotFoundException;//分享查询
	  public void talkAdd(talk talk) throws SQLException;//添加
	  public void talkDelete(talk talk) throws SQLException;//删除
	  
	  public void replyTalkAdd(replytalk reply);//添加回复
	  public List<replytalk> replySelect() throws SQLException, ClassNotFoundException;//查询回复
	  
	  public List<praise> praiseSelect() throws SQLException;	//查询点赞
	  public void praiseInsert(praise praise);//添加点赞
	  public void praiseDelete(praise praise);
	  
	  
	  public void talkUpdate(talk talk);
	  public void topicAdd(topic topic);
	  public ArrayList<topic> topicGet(topic topic);
	  public int getTopicJoins(String topicName);
	  public void topicEdit(topic topic);
	  public void topicDelete(topic topic);
	
}
