package wrc.xy.entity;
public class userinfo {
	private int use_id;				//用户编号
	private String avaPath;		//头像存储路径
	private String nickName;	//昵称
	private String birth;		//生日
	private String sex;			//性别
	private String school;		//学校
	private String academy;		//院系
	private String major;		//专业
	private String entryYear;	//入学年份
	private String perSign;		//个人签名
	private String hobby;		//兴趣爱好
	private String homeTown;	//家乡
	private String account;		//账户
	private String passWord;	//密码
	private String newPassWord;	//用户输入的新密码
	private String registerTime;//用户注册时间
	public int getUse_id() {
		return use_id;
	}
	public void setUse_id(int use_id) {
		this.use_id = use_id;
	}
	public String getAvaPath() {
		return avaPath;
	}
	public void setAvaPath(String avaPath) {
		this.avaPath = avaPath;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getAcademy() {
		return academy;
	}
	public void setAcademy(String academy) {
		this.academy = academy;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getEntryYear() {
		return entryYear;
	}
	public void setEntryYear(String entryYear) {
		this.entryYear = entryYear;
	}
	public String getPerSign() {
		return perSign;
	}
	public void setPerSign(String perSign) {
		this.perSign = perSign;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getHomeTown() {
		return homeTown;
	}
	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
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
	public String getNewPassWord() {
		return newPassWord;
	}
	public void setNewPassWord(String newPassWord) {
		this.newPassWord = newPassWord;
	}
	public String getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}
	@Override
	public String toString() {
		return "userinfo [use_id=" + use_id + ", avaPath=" + avaPath + ", nickName=" + nickName + ", birth=" + birth
				+ ", sex=" + sex + ", school=" + school + ", academy=" + academy + ", major=" + major + ", entryYear="
				+ entryYear + ", perSign=" + perSign + ", hobby=" + hobby + ", homeTown=" + homeTown + ", account="
				+ account + ", passWord=" + passWord + ", newPassWord=" + newPassWord + ", registerTime=" + registerTime
				+ "]";
	}
	
}
