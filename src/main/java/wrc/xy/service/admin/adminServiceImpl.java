package wrc.xy.service.admin;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wrc.xy.dao.adminDao;
import wrc.xy.entity.adminAccount;
import wrc.xy.entity.adminLog;;

@Service
@Transactional
public class adminServiceImpl implements adminService{

	@Autowired
	private adminDao ad;
	
	@Override
	public adminAccount login(adminAccount info) {
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

	@Override
	public void adminAdd(adminAccount admin) {
		// TODO Auto-generated method stub
		ad.adminAdd(admin);
	}

	@Override
	public adminAccount adminGetByAccount(String applyAccount) {
		// TODO Auto-generated method stub
		return ad.adminGetByAccount(applyAccount);
	}

}
