package wrc.xy.entity;

import java.util.ArrayList;

public class adminInfo {

	private int allClub;
	private int allActivity;
	private int allUser;
	private int examineClub;
	private int examineActivity;
	private ArrayList<adminLog> adminLogs ;
	
	public ArrayList<adminLog> getAdminLogs() {
		return adminLogs;
	}
	public void setAdminLogs(ArrayList<adminLog> adminLogs) {
		this.adminLogs = adminLogs;
	}
	public int getAllClub() {
		return allClub;
	}
	public void setAllClub(int allClub) {
		this.allClub = allClub;
	}
	public int getAllActivity() {
		return allActivity;
	}
	public void setAllActivity(int allActivity) {
		this.allActivity = allActivity;
	}
	public int getAllUser() {
		return allUser;
	}
	public void setAllUser(int allUser) {
		this.allUser = allUser;
	}
	public int getExamineClub() {
		return examineClub;
	}
	public void setExamineClub(int examineClub) {
		this.examineClub = examineClub;
	}
	public int getExamineActivity() {
		return examineActivity;
	}
	public void setExamineActivity(int examineActivity) {
		this.examineActivity = examineActivity;
	}
	@Override
	public String toString() {
		return "adminInfo [allClub=" + allClub + ", allActivity=" + allActivity + ", allUser=" + allUser
				+ ", examineClub=" + examineClub + ", examineActivity=" + examineActivity + ", adminLogs=" + adminLogs
				+ "]";
	}
	
}
