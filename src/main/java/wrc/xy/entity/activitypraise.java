package wrc.xy.entity;

public class activitypraise {

	private int activitypraise_id;		//活动点赞编号
	private String account;		//用户名
	private int activity_id;	//活动编号
	public int getActivitypraise_id() {
		return activitypraise_id;
	}
	public void setActivitypraise_id(int activitypraise_id) {
		this.activitypraise_id = activitypraise_id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getActivity_id() {
		return activity_id;
	}
	public void setActivity_id(int activity_id) {
		this.activity_id = activity_id;
	}
	@Override
	public String toString() {
		return "activitypraise [activitypraise_id=" + activitypraise_id + ", account=" + account + ", activity_id="
				+ activity_id + "]";
	}
	
	
}
