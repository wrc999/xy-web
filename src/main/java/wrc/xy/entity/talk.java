package wrc.xy.entity;

import java.util.ArrayList;

public class talk {
	
	private int talk_id;		//分享编号
	private int use_id;			//用户编号
	private String talktime;	//分享时间
	private String talkcontent;	//分享内容
	private String talkphoto;	//分享照片url
	private String school;		//获取学校名
	private String account;		//获取用户名,通过用户名到极光后台查询用户头像
	private String topicName;//话题名
    private ArrayList<replytalk> replyTalkList;	//回复集合
    private ArrayList<praise> praiseList;	//点赞集合
	public int getTalk_id() {
		return talk_id;
	}
	public void setTalk_id(int talk_id) {
		this.talk_id = talk_id;
	}
	public int getUse_id() {
		return use_id;
	}
	public void setUse_id(int use_id) {
		this.use_id = use_id;
	}
	public String getTalktime() {
		return talktime;
	}
	public void setTalktime(String talktime) {
		this.talktime = talktime;
	}
	public String getTalkcontent() {
		return talkcontent;
	}
	public void setTalkcontent(String talkcontent) {
		this.talkcontent = talkcontent;
	}
	public String getTalkphoto() {
		return talkphoto;
	}
	public void setTalkphoto(String talkphoto) {
		this.talkphoto = talkphoto;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public ArrayList<replytalk> getReplyTalkList() {
		return replyTalkList;
	}
	public void setReplyTalkList(ArrayList<replytalk> replyTalkList) {
		this.replyTalkList = replyTalkList;
	}
	public ArrayList<praise> getPraiseList() {
		return praiseList;
	}
	public void setPraiseList(ArrayList<praise> praiseList) {
		this.praiseList = praiseList;
	}
	@Override
	public String toString() {
		return "talk [talk_id=" + talk_id + ", use_id=" + use_id + ", talktime=" + talktime + ", talkcontent="
				+ talkcontent + ", talkphoto=" + talkphoto + ", school=" + school + ", account=" + account
				+ ", topicName=" + topicName + ", replyTalkList=" + replyTalkList + ", praiseList=" + praiseList + "]";
	}

    
}
