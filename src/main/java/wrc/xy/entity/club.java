package wrc.xy.entity;

import java.util.ArrayList;

public class club {

	private int club_id;
	private String account;//发布人账号
	private String clubAva;//社团头像
	private String clubName;//社团名
	private String clubSlogan;//社团口号
	private String clubIntro;//社团简介
	private String clubSchool;//社团所在学校
	private String createTime;//创建时间
	private String sort;//分类
	private String groupId;//社团聊天组群号
	private int clubPass;//是否审核，0.未审核;1.通过,2:未通过
	private ArrayList<clubmember> memberList;
	private ArrayList<clubfocus> focusList;
	private ArrayList<view> viewList;
	private ArrayList<activity> activityList;
	
	@Override
	public String toString() {
		return "club [club_id=" + club_id + ", account=" + account + ", clubAva=" + clubAva + ", clubName=" + clubName
				+ ", clubSlogan=" + clubSlogan + ", clubIntro=" + clubIntro + ", clubSchool=" + clubSchool
				+ ", createTime=" + createTime + ", sort=" + sort + ", groupId=" + groupId + ", clubPass=" + clubPass
				+ ", memberList=" + memberList + ", focusList=" + focusList + ", viewList=" + viewList
				+ ", activityList=" + activityList + "]";
	}
	public int getClub_id() {
		return club_id;
	}
	public void setClub_id(int club_id) {
		this.club_id = club_id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getClubAva() {
		return clubAva;
	}
	public void setClubAva(String clubAva) {
		this.clubAva = clubAva;
	}
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public String getClubSlogan() {
		return clubSlogan;
	}
	public void setClubSlogan(String clubSlogan) {
		this.clubSlogan = clubSlogan;
	}
	public String getClubIntro() {
		return clubIntro;
	}
	public void setClubIntro(String clubIntro) {
		this.clubIntro = clubIntro;
	}
	public String getClubSchool() {
		return clubSchool;
	}
	public void setClubSchool(String clubSchool) {
		this.clubSchool = clubSchool;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public int getClubPass() {
		return clubPass;
	}
	public void setClubPass(int clubPass) {
		this.clubPass = clubPass;
	}
	public ArrayList<clubmember> getMemberList() {
		return memberList;
	}
	public void setMemberList(ArrayList<clubmember> memberList) {
		this.memberList = memberList;
	}
	public ArrayList<clubfocus> getFocusList() {
		return focusList;
	}
	public void setFocusList(ArrayList<clubfocus> focusList) {
		this.focusList = focusList;
	}
	public ArrayList<view> getViewList() {
		return viewList;
	}
	public void setViewList(ArrayList<view> viewList) {
		this.viewList = viewList;
	}
	public ArrayList<activity> getActivityList() {
		return activityList;
	}
	public void setActivityList(ArrayList<activity> activityList) {
		this.activityList = activityList;
	}
	
}
