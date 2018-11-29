package wrc.xy.service.user;

import java.sql.SQLException;
import java.util.ArrayList;

import wrc.xy.entity.suggest;
import wrc.xy.entity.userinfo;


public interface userService {
		public userinfo userGet(userinfo user);//查询业务
		public void userAdd(userinfo user) throws SQLException;//添加业务
		public void userDel(userinfo user) throws SQLException;//删除业务
		public userinfo userUpdate(userinfo user) throws SQLException;//修改业务
		public void UserPassWord_edit(userinfo user) throws SQLException;//密码修改业务
		public void userSuggestAdd(suggest suggest) throws SQLException;//意见反馈业务
		public ArrayList<userinfo> userAdminGet(userinfo user);//管理员获取所有用户
		public void changePassWord(userinfo user);//管理员获取所有用户
		public userinfo login(userinfo user);
}
