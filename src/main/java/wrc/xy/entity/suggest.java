package wrc.xy.entity;


public class suggest {

	private int suggest_id;
	private int use_id;
	private String suggestcontent;
	private String suggesttime;
	
	public String getSuggesttime() {
		return suggesttime;
	}
	public void setSuggesttime(String suggesttime) {
		this.suggesttime = suggesttime;
	}
	public int getSuggest_id() {
		return suggest_id;
	}
	public void setSuggest_id(int suggest_id) {
		this.suggest_id = suggest_id;
	}
	public int getUse_id() {
		return use_id;
	}
	public void setUse_id(int use_id) {
		this.use_id = use_id;
	}
	public String getSuggestcontent() {
		return suggestcontent;
	}
	public void setSuggestcontent(String suggestcontent) {
		this.suggestcontent = suggestcontent;
	}	
	
}
