package wrc.xy.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wrc.xy.entity.praise;
import wrc.xy.entity.replytalk;
import wrc.xy.entity.talk;
import wrc.xy.entity.topic;
import wrc.xy.service.talks.talkService;
import wrc.xy.util.DateUtil;


@RestController
@RequestMapping("talk")
public class talks {

	@Autowired
	public talkService ts;
	
	@RequestMapping("add")
	public  String add(talk talk) throws Exception {
		talk.setTalktime(DateUtil.getCurrentTime());
		ts.talkAdd(talk);
		return "1";
	}
	@RequestMapping("topicAdd")
	public  String topicAdd(topic topic) throws Exception {
		topic.setTopicCreateTime(DateUtil.getCurrentTime());
		ts.topicAdd(topic);
		return "1";
	}
	@RequestMapping("topicEdit")
	public  String topicEdit(topic topic) throws Exception {
		ts.topicEdit(topic);
		return "1";
	}
	@RequestMapping("topicDelete")
	public  String topicDelete(topic topic) throws Exception {
		ts.topicDelete(topic);
		return "1";
	}
	@RequestMapping("topicGet")
	public  ArrayList<topic> topicGet(topic topic) throws Exception {
		return ts.topicGet(topic);
	}
	
	//修改用户接口
	@RequestMapping("/edit")
	public  talk edit(talk talk) throws Exception{
		return ts.talkUpdate(talk);
	}
	
	@RequestMapping("praiseAdd")
	public  int praiseAdd(praise praise) throws Exception {
		ts.praiseAdd(praise);
		return praise.getPraise_id();
	}
	@RequestMapping("praiseDelete")
	public  String praiseDelete(praise praise) throws Exception {
		ts.praiseDelete(praise);
		return "1";
	}
	
	@RequestMapping("replyAdd")
	public  String replyTalkAdd(replytalk replyTalk) throws Exception {
		replyTalk.setReplytime(DateUtil.getCurrentTime());
		ts.replyAdd(replyTalk);
		return "1";
	}
	
	@RequestMapping("delete")
	public  String delete(talk talk) throws Exception {
		ts.talkDel(talk);
		return "1";
	}
	
	@RequestMapping("get")
	public  ArrayList<talk> get(talk talk) throws Exception {
		ArrayList<talk> talkList = ts.talkFind(talk);
		ArrayList<praise> praiseList = (ArrayList<praise>) ts.praiseFind();
  		ArrayList<replytalk> ReplyList = (ArrayList<replytalk>) ts.replyFind();
  		for(int i=0;i<talkList.size();i++) {
  			ArrayList<replytalk> reply = new ArrayList<replytalk>();
  			for(int j=0;j<ReplyList.size();j++) {
  				if(talkList.get(i).getTalk_id()==ReplyList.get(j).getTalk_id()) {
  					reply.add(ReplyList.get(j));
  				}
  				talkList.get(i).setReplyTalkList(reply);
  			}
  		}
  		//添加点赞集合
  		for(int i=0;i<talkList.size();i++) {
  			ArrayList<praise> praise = new ArrayList<praise>();
  			for(int j=0;j<praiseList.size();j++) {
  				if(talkList.get(i).getTalk_id()==praiseList.get(j).getTalk_id()) {
  					praise.add(praiseList.get(j));
  				}
  				talkList.get(i).setPraiseList(praise);
  			}
  		}
		return talkList;
	}
	
		//后台查询动态接口
		@RequestMapping("/adminGet")
		public  Map<String, Serializable> adminGet(talk talk,String limit,String page) throws Exception{
			int pageSize = 10;
			if(limit != null && !limit.equals("")){
				pageSize = Integer.parseInt(limit);
			}
			int page1 = 1;
			if(page != null && !page.equals("")){
				page1 = Integer.parseInt(page);
			}
			ArrayList<talk> talkList = ts.talkFind(talk);
			int total = talkList.size();
			ArrayList<talk> userList1 = new ArrayList<talk>();
			Map<String, Serializable> resultMap = new HashMap<String, Serializable>();
			resultMap.put("count", total);
			resultMap.put("msg", "");
			resultMap.put("code", 0);
			if(page != null && page.length() > 0 && limit!=null && limit.length()>0){
				for(int i = (page1-1)*pageSize ; i< page1*pageSize && i< total;i++){
					userList1.add(talkList.get(i));
				}
				resultMap.put("data", userList1);
				return resultMap;
			}else{
				resultMap.put("data", talkList);
				return resultMap;
			}
		}
		//后台查询动态接口
		@RequestMapping("/adminGetTopic")
		public  Map<String, Serializable> adminGetTopic(topic topic,String limit,String page) throws Exception{
			int pageSize = 10;
			if(limit != null && !limit.equals("")){
				pageSize = Integer.parseInt(limit);
			}
			int page1 = 1;
			if(page != null && !page.equals("")){
				page1 = Integer.parseInt(page);
			}
			ArrayList<topic> topicList = ts.topicGet(topic);
			int total = topicList.size();
			ArrayList<topic> topicList1 = new ArrayList<topic>();
			Map<String, Serializable> resultMap = new HashMap<String, Serializable>();
			resultMap.put("count", total);
			resultMap.put("msg", "");
			resultMap.put("code", 0);
			if(page != null && page.length() > 0 && limit!=null && limit.length()>0){
				for(int i = (page1-1)*pageSize ; i< page1*pageSize && i< total;i++){
					topicList1.add(topicList.get(i));
				}
				resultMap.put("data", topicList1);
				return resultMap;
			}else{
				resultMap.put("data", topicList);
				return resultMap;
			}
		}
}
