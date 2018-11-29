package wrc.xy.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import wrc.xy.entity.club;
import wrc.xy.entity.clubfocus;
import wrc.xy.entity.clubmember;
import wrc.xy.entity.activity;

public interface clubDao {
	
	  public ArrayList<club> clubSelect(club club) throws SQLException;//分享查询
	  public void clubAdd(club club) throws SQLException;//添加
	  public void clubDelete(club club) throws SQLException;//删除
	  public void clubJoin(clubmember member);
	  public void clubQuit(clubmember member);
	  public ArrayList<clubmember> memberGet(club v);
	  public ArrayList<club> clubSearch(club club);
	  public club findById(club club);
	  public void focus(clubfocus focus);
	  public void unfocus(clubfocus focus);
	  public ArrayList<activity> activityGet(club c);
	  public ArrayList<clubfocus> focusGet(club c);
	  public ArrayList<club> findByAccount(String account);
	  public ArrayList<clubfocus> findMyFocus(String account);
	  public void changeOwner(club c);
	  public void clubEdit(club club);
	  public ArrayList<club> adminGetExamine(club club);
	
}
