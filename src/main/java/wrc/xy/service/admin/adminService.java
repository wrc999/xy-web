package wrc.xy.service.admin;

import java.util.ArrayList;

import wrc.xy.entity.adminLog;
import wrc.xy.entity.userinfo;

public interface adminService {

	public void adminLogAdd(adminLog  info) throws Exception;
	public ArrayList<adminLog> adminLogSelect() throws Exception;
	public String login(userinfo info);
}
