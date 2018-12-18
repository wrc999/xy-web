package wrc.xy.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import wrc.xy.entity.suggest;
import wrc.xy.entity.userinfo;


public interface userDao {

	public userinfo userGet(userinfo user);//查询
	public void userAdd(userinfo user) throws SQLException;//添加
	public void userDelete(userinfo user) throws SQLException;//删除
	public void userUpdate(userinfo user) throws SQLException;//修改
	public void userSuggestAdd(suggest suggest) throws SQLException;//意见反馈
	public ArrayList<userinfo> userAdminGet(userinfo user);
	public void changePassWord(userinfo user);
	public userinfo login(userinfo user);
	public ArrayList<suggest> adminGetSuggest(suggest suggest);
}
