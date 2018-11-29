package wrc.xy.service.admin;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wrc.xy.entity.adminLog;
import wrc.xy.entity.userinfo;
import wrc.xy.dao.adminDao;;

@Service
@Transactional
public class adminServiceImpl implements adminService{

	@Autowired
	private adminDao ad;
	
	@Override
	public String login(userinfo info) {
		// TODO Auto-generated method stub
		return ad.login(info);
	}
	
	@Override
	public void adminLogAdd(adminLog info) throws Exception {
		// TODO Auto-generated method stub
		ad.adminLogAdd(info);
	}

	@Override
	public ArrayList<adminLog> adminLogSelect() throws Exception {
		// TODO Auto-generated method stub
		return ad.adminLogSelect();
	}


}
