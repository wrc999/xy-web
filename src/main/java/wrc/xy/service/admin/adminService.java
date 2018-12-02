package wrc.xy.service.admin;

import java.util.ArrayList;

import wrc.xy.entity.adminAccount;
import wrc.xy.entity.adminLog;

public interface adminService {

	public void adminLogAdd(adminLog  info) throws Exception;
	public ArrayList<adminLog> adminLogSelect() throws Exception;
	public adminAccount login(adminAccount info);
	public void adminAdd(adminAccount admin);
	public adminAccount adminGetByAccount(String applyAccount);
}
