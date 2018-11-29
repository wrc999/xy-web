package wrc.xy.entity;

public class clubfocus {

	private int focus_id;
	private String account;
	private int club_id;
	public int getFocus_id() {
		return focus_id;
	}
	public void setFocus_id(int focus_id) {
		this.focus_id = focus_id;
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
	@Override
	public String toString() {
		return "clubfocus [focus_id=" + focus_id + ", account=" + account + ", club_id=" + club_id + "]";
	}
	
}
