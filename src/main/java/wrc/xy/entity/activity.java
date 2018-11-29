package wrc.xy.entity;

import java.util.ArrayList;

public class activity {

	private int activity_id;	//活动编号
	private String account;		//发起人账号
	private String name;		//活动名称
	private String starttime;	//活动开始时间
	private String endtime;		//活动结束时间
	private String place;		//活动地点
	private String ava;		//活动海报
	private String pic1;		//活动照片1
	private String pic2;		//活动照片2
	private String pic3;		//活动照片3
	private String intro;		//活动介绍
	private String keyword;		//关键字
	private int peopleNum;	//活动人数
	private int online;			//线上线下
	private String createTime;	//创建时间
	private int activityPass;//是否审核，0.未审核;1.通过,2:未通过
	private ArrayList<String> aAccount;	//点赞用户集合
    private ArrayList<String> jAccount;	//报名用户据集合
	public int getActivity_id() {
		return activity_id;
	}
	public void setActivity_id(int activity_id) {
		this.activity_id = activity_id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getAva() {
		return ava;
	}
	public void setAva(String ava) {
		this.ava = ava;
	}
	public String getPic1() {
		return pic1;
	}
	public void setPic1(String pic1) {
		this.pic1 = pic1;
	}
	public String getPic2() {
		return pic2;
	}
	public void setPic2(String pic2) {
		this.pic2 = pic2;
	}
	public String getPic3() {
		return pic3;
	}
	public void setPic3(String pic3) {
		this.pic3 = pic3;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getOnline() {
		return online;
	}
	public void setOnline(int online) {
		this.online = online;
	}
	public int getActivityPass() {
		return activityPass;
	}
	public void setActivityPass(int activityPass) {
		this.activityPass = activityPass;
	}
	public ArrayList<String> getaAccount() {
		return aAccount;
	}
	public void setaAccount(ArrayList<String> aAccount) {
		this.aAccount = aAccount;
	}
	public ArrayList<String> getjAccount() {
		return jAccount;
	}
	public void setjAccount(ArrayList<String> jAccount) {
		this.jAccount = jAccount;
	}
	public int getPeopleNum() {
		return peopleNum;
	}
	public void setPeopleNum(int peopleNum) {
		this.peopleNum = peopleNum;
	}
	
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "activity [activity_id=" + activity_id + ", account=" + account + ", name=" + name + ", starttime="
				+ starttime + ", endtime=" + endtime + ", place=" + place + ", ava=" + ava + ", pic1=" + pic1
				+ ", pic2=" + pic2 + ", pic3=" + pic3 + ", intro=" + intro + ", keyword=" + keyword + ", peopleNum="
				+ peopleNum + ", online=" + online + ", createTime=" + createTime + ", activityPass=" + activityPass
				+ ", aAccount=" + aAccount + ", jAccount=" + jAccount + "]";
	}

	
}
