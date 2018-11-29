package wrc.xy.entity;

public class topic {

	private int topic_id;
	private String account;//话题分享
	private String topicName;//话题名
	private String topicIntro;//话题导语
	private String topicPic;//话题封面
	private String topicCreateTime;//创建时间
	private int topicJoins;//话题参与人数
	public int getTopic_id() {
		return topic_id;
	}
	public void setTopic_id(int topic_id) {
		this.topic_id = topic_id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getTopicIntro() {
		return topicIntro;
	}
	public void setTopicIntro(String topicIntro) {
		this.topicIntro = topicIntro;
	}
	public String getTopicPic() {
		return topicPic;
	}
	public void setTopicPic(String topicPic) {
		this.topicPic = topicPic;
	}
	public String getTopicCreateTime() {
		return topicCreateTime;
	}
	public void setTopicCreateTime(String topicCreateTime) {
		this.topicCreateTime = topicCreateTime;
	}
	public int getTopicJoins() {
		return topicJoins;
	}
	public void setTopicJoins(int topicJoins) {
		this.topicJoins = topicJoins;
	}
	@Override
	public String toString() {
		return "topic [topic_id=" + topic_id + ", account=" + account + ", topicName=" + topicName + ", topicIntro="
				+ topicIntro + ", topicPic=" + topicPic + ", topicCreateTime=" + topicCreateTime + ", topicJoins="
				+ topicJoins + "]";
	}
	
}
