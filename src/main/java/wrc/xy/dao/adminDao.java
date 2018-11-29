package wrc.xy.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import wrc.xy.entity.adminLog;
import wrc.xy.entity.userinfo;

public interface adminDao {

	public void adminLogAdd(adminLog info) throws SQLException;//添加
	public ArrayList<adminLog> adminLogSelect() throws SQLException;//添加
	public String login(userinfo info);
}
