package wrc.xy.service.user;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wrc.xy.dao.userDao;
import wrc.xy.entity.suggest;
import wrc.xy.entity.userinfo;


@Service
@Transactional
public class userServiceImpl implements userService{
	@Autowired
	private userDao ud;

	@Override
	public userinfo login(userinfo user) {
		// TODO Auto-generated method stub
		return ud.login(user);
	}
	@Override
	public userinfo userGet(userinfo user) {
		// TODO Auto-generated method stub
		return ud.userGet(user);
	}

	@Override
	public void userAdd(userinfo user) throws SQLException {
		// TODO Auto-generated method stub
		ud.userAdd(user);
	}

	@Override
	public void userDel(userinfo user) throws SQLException {
		// TODO Auto-generated method stub
		ud.userDelete(user);
	}

	@Override
	public userinfo userUpdate(userinfo user) throws SQLException {
		// TODO Auto-generated method stub
		ud.userUpdate(user);
		return ud.userGet(user);
	}

	@Override
	public void UserPassWord_edit(userinfo user) throws SQLException {
		// TODO Auto-generated method stub
		ud.userPassWord_edit(user);
	}

	@Override
	public void userSuggestAdd(suggest suggest) throws SQLException {
		// TODO Auto-generated method stub
		ud.userSuggestAdd(suggest);
	}

	@Override
	public ArrayList<userinfo> userAdminGet(userinfo user) {
		// TODO Auto-generated method stub
		return ud.userAdminGet(user);
	}

	@Override
	public void changePassWord(userinfo user) {
		// TODO Auto-generated method stub
		ud.changePassWord(user);
	}


}
