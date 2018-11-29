package wrc.xy.service.talks;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import wrc.xy.entity.praise;
import wrc.xy.entity.replytalk;
import wrc.xy.entity.talk;
import wrc.xy.entity.topic;


public interface talkService {
	
	  public ArrayList<talk> talkFind(talk talk) throws Exception;//用户查询分享
	  public void talkAdd(talk talk) throws SQLException;//添加分享
	  public void talkDel(talk talk) throws Exception;//删除分享
	  
	  public void replyAdd(replytalk reply) throws Exception;//添加回复
	  public List<replytalk> replyFind() throws Exception;//查询回复
	  public List<praise> praiseFind() throws Exception;//查询点赞
	  public void praiseAdd(praise praise) throws Exception;//添加点赞
	  public void praiseDelete(praise praise);
	  
	  
	  public talk talkUpdate(talk talk) throws Exception;
	  public void topicAdd(topic topic);
	  public ArrayList<topic> topicGet(topic topic);
	  public void topicEdit(topic topic);
	  public void topicDelete(topic topic);
}
