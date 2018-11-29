package wrc.xy.entity;

public class view {

	private int view_id;
	private int use_id;
	private String photo;
	private String clubName;
	private int club_id;
	private String uploadTime;
	public int getView_id() {
		return view_id;
	}
	public void setView_id(int view_id) {
		this.view_id = view_id;
	}
	public int getUse_id() {
		return use_id;
	}
	public void setUse_id(int use_id) {
		this.use_id = use_id;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public int getClub_id() {
		return club_id;
	}
	public void setClub_id(int club_id) {
		this.club_id = club_id;
	}
	public String getUploadTime() {
		return uploadTime;
	}
	public void setUploadTime(String uploadTime) {
		this.uploadTime = uploadTime;
	}
	@Override
	public String toString() {
		return "view [view_id=" + view_id + ", use_id=" + use_id + ", photo=" + photo + ", clubName=" + clubName
				+ ", club_id=" + club_id + ", uploadTime=" + uploadTime + "]";
	}
	
}
