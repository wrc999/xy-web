package wrc.xy.entity;

public class clubmember {

	private int member_id;
	private String account;
	private int club_id;
	private String groupId;//社团聊天组群号
	private String joinTime;
	public int getMember_id() {
		return member_id;
	}
	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getClub_id() {
		return club_id;
	}
	public void setClub_id(int club_id) {
		this.club_id = club_id;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getJoinTime() {
		return joinTime;
	}
	public void setJoinTime(String joinTime) {
		this.joinTime = joinTime;
	}
	@Override
	public String toString() {
		return "clubmember [member_id=" + member_id + ", account=" + account + ", club_id=" + club_id + ", groupId="
				+ groupId + ", joinTime=" + joinTime + "]";
	}
	
}
