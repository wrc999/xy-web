package wrc.xy.entity;

public class activityjoins {

	private int joins_id;		//报名编号
	private String account;		//用户名
	private int activity_id;	//活动编号
	private String name;		//申请人
	private String contact;		//联系方式
	public int getJoins_id() {
		return joins_id;
	}
	public void setJoins_id(int joins_id) {
		this.joins_id = joins_id;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "activityjoins [joins_id=" + joins_id + ", account=" + account + ", activity_id=" + activity_id
				+ ", name=" + name + ", contact=" + contact + "]";
	}
	
	
}
