package wrc.xy.service.club;

import java.sql.SQLException;
import java.util.ArrayList;

import wrc.xy.entity.club;
import wrc.xy.entity.clubfocus;
import wrc.xy.entity.clubmember;

public interface clubService {

	public void clubAdd(club v) throws Exception;
	public void clubDelete(club v) throws SQLException;
	public ArrayList<club> clubGet(club v) throws SQLException;
	public void clubJoin(clubmember member);
	public void clubQuit(clubmember member);
	public ArrayList<club> clubSearch(club club);
	public club findById(club club);
	public void focus(clubfocus focus);
	public void unfocus(clubfocus focus);
	public ArrayList<club> findByAccount(String account);
	public ArrayList<club> findMyFocus(String account);
	public void changeOwner(club c);
	public void clubEdit(club club);
	public ArrayList<club> adminGetExamine(club club);
}
