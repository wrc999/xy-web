package wrc.xy.entity;

public class message {

	private int message_id;//主键id
	private String sendAccount;//发送方账号
	private String receiveAccount;//接收账号
	private String root;//来源，如好友添加、社团申请等
	private int club_id;//如果是社团申请，则添加欲要加入的社团id
	private int activity_id;//如果是活动申请，则添加欲要加入的活动id
	private String reason;//添加原因
	private int result;//结果，0标识还未反馈,1标识同意,2标识拒绝
	public int getMessage_id() {
		return message_id;
	}
	public void setMessage_id(int message_id) {
		this.message_id = message_id;
	}
	public String getSendAccount() {
		return sendAccount;
	}
	public void setSendAccount(String sendAccount) {
		this.sendAccount = sendAccount;
	}
	public String getReceiveAccount() {
		return receiveAccount;
	}
	public void setReceiveAccount(String receiveAccount) {
		this.receiveAccount = receiveAccount;
	}
	public String getRoot() {
		return root;
	}
	public void setRoot(String root) {
		this.root = root;
	}
	public int getClub_id() {
		return club_id;
	}
	public void setClub_id(int club_id) {
		this.club_id = club_id;
	}
	public int getActivity_id() {
		return activity_id;
	}
	public void setActivity_id(int activity_id) {
		this.activity_id = activity_id;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "message [message_id=" + message_id + ", sendAccount=" + sendAccount + ", receiveAccount="
				+ receiveAccount + ", root=" + root + ", club_id=" + club_id + ", activity_id=" + activity_id
				+ ", reason=" + reason + ", result=" + result + "]";
	}
	
}
