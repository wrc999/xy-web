package wrc.xy.entity;

public class replytalk {
	
	private int replytalk_id;		//回复编号
	private int use_id;				//用户编号
	private int talk_id;			//分享编号
	private String replycontent;	//回复内容
	private String replytime;		//回复时间
	private String nickName;		//用户昵称
	public int getReplytalk_id() {
		return replytalk_id;
	}
	public void setReplytalk_id(int replytalk_id) {
		this.replytalk_id = replytalk_id;
	}
	public int getUse_id() {
		return use_id;
	}
	public void setUse_id(int use_id) {
		this.use_id = use_id;
	}
	public int getTalk_id() {
		return talk_id;
	}
	public void setTalk_id(int talk_id) {
		this.talk_id = talk_id;
	}
	public String getReplycontent() {
		return replycontent;
	}
	public void setReplycontent(String replycontent) {
		this.replycontent = replycontent;
	}
	public String getReplytime() {
		return replytime;
	}
	public void setReplytime(String replytime) {
		this.replytime = replytime;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	@Override
	public String toString() {
		return "ReplyTalk [replytalk_id=" + replytalk_id + ", use_id=" + use_id + ", talk_id=" + talk_id
				+ ", replycontent=" + replycontent + ", replytime=" + replytime + ", nickName=" + nickName + "]";
	}
}
