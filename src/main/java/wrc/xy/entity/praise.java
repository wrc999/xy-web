package wrc.xy.entity;

public class praise {

	private int praise_id;
	private int talk_id;
	private int use_id;
	private String nickName;
	public int getPraise_id() {
		return praise_id;
	}
	public void setPraise_id(int praise_id) {
		this.praise_id = praise_id;
	}
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
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	@Override
	public String toString() {
		return "praise [praise_id=" + praise_id + ", talk_id=" + talk_id + ", use_id=" + use_id + ", nickName="
				+ nickName + "]";
	}
	
}
