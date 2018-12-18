package wrc.xy.service.club;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wrc.xy.dao.clubDao;
import wrc.xy.dao.viewDao;
import wrc.xy.entity.club;
import wrc.xy.entity.clubfocus;
import wrc.xy.entity.clubmember;
import wrc.xy.entity.view;
import wrc.xy.util.DateUtil;

@Service
@Transactional
public class clubServiceImpl implements clubService{

	@Autowired
	private clubDao cd;
	@Autowired
	private viewDao vd;
	@Override
	public void clubAdd(club v) throws Exception {
		cd.clubAdd(v);
		clubmember member = new clubmember();
		member.setAccount(v.getAccount());
		member.setClub_id(v.getClub_id());
		member.setJoinTime(DateUtil.getCurrentTime());
		cd.clubJoin(member);
	}

	@Override
	public void clubDelete(club v) throws SQLException {
		cd.clubDelete(v);
	}

	@Override
	public ArrayList<club> clubGet(club v) throws SQLException {
		ArrayList<club> clubList = cd.clubSelect(v);
		for(club c:clubList){
			c.setMemberList(cd.memberGet(c));
		}
		for(club c:clubList){
			c.setFocusList(cd.focusGet(c));
		}
		return clubList;
	}

	@Override
	public void clubJoin(clubmember member) {
		// TODO Auto-generated method stub
		club tempClub = new club();
		tempClub.setClub_id(member.getClub_id());
		club club = cd.findById(tempClub);
		member.setGroupId(club.getGroupId());
		cd.clubJoin(member);
	}

	@Override
	public void clubQuit(clubmember member) {
		// TODO Auto-generated method stub
		cd.clubQuit(member);
	}

	@Override
	public ArrayList<club> clubSearch(club club) {
		// TODO Auto-generated method stub
		ArrayList<club> clubList = cd.clubSearch(club);
		for(club c:clubList){
			c.setMemberList(cd.memberGet(c));
		}
		return clubList;
	}

	@Override
	public club findById(club c) {
		// TODO Auto-generated method stub
		club club = cd.findById(c);
		club.setMemberList(cd.memberGet(club));
		club.setFocusList(cd.focusGet(club));
		view v = new view();
		v.setClub_id(club.getClub_id());
		club.setViewList(vd.get(v));
		club.setActivityList(cd.activityGet(club));
		return club;
	}

	@Override
	public void focus(clubfocus focus) {
		// TODO Auto-generated method stub
		cd.focus(focus);
	}

	@Override
	public void unfocus(clubfocus focus) {
		// TODO Auto-generated method stub
		cd.unfocus(focus);
	}

	@Override
	public ArrayList<club> findByAccount(String account) {
		// TODO Auto-generated method stub
		ArrayList<club> clubList = cd.findByAccount(account);
		for(club c:clubList){
			c.setMemberList(cd.memberGet(c));
		}
		for(club c:clubList){
			c.setFocusList(cd.focusGet(c));
		}
		return clubList;
	}

	@Override
	public ArrayList<club> findMyFocus(String account) {
		// TODO Auto-generated method stub
		ArrayList<clubfocus> focusList = cd.findMyFocus(account);
		ArrayList<club> list = new ArrayList<club>();
		club club = new club();
		for(clubfocus focus:focusList) {
			club.setClub_id(focus.getClub_id());;
			list.add(cd.findById(club));
		}
		for(club c:list){
			c.setFocusList(cd.focusGet(c));
		}
		return list;
	}

	@Override
	public void changeOwner(club c) {
		// TODO Auto-generated method stub
		cd.changeOwner(c);
	}

	@Override
	public void clubEdit(club club) {
		// TODO Auto-generated method stub
		cd.clubEdit(club);
	}

	@Override
	public ArrayList<club> adminGetExamine(club club) {
		// TODO Auto-generated method stub
		return cd.adminGetExamine(club);
	}

}
