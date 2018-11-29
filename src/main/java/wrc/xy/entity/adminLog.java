package wrc.xy.entity;

public class adminLog {

	private int info_id;
	private String account;
	private String details;
	private String createTime;
	public int getInfo_id() {
		return info_id;
	}
	public void setInfo_id(int info_id) {
		this.info_id = info_id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "adminLog [info_id=" + info_id + ", account=" + account + ", details=" + details + ", createTime="
				+ createTime + "]";
	}
	
}
