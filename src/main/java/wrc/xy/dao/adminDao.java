package wrc.xy.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import wrc.xy.entity.adminAccount;
import wrc.xy.entity.adminLog;

public interface adminDao {

	public void adminLogAdd(adminLog info) throws SQLException;//添加
	public ArrayList<adminLog> adminLogSelect() throws SQLException;//添加
	public adminAccount login(adminAccount info);
	public void adminAdd(adminAccount admin);
	public adminAccount adminGetByAccount(String applyAccount);
}
