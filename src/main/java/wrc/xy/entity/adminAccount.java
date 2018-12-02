package wrc.xy.entity;

public class adminAccount {
	
	private int admin_id;
	private String applyAccount;
	private String account;
	private String passWord;
	private String power;
	private String createTime;
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getApplyAccount() {
		return applyAccount;
	}
	public void setApplyAccount(String applyAccount) {
		this.applyAccount = applyAccount;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "adminAccount [admin_id=" + admin_id + ", applyAccount=" + applyAccount + ", account=" + account
				+ ", passWord=" + passWord + ", power=" + power + ", createTime=" + createTime + "]";
	}
	
}
