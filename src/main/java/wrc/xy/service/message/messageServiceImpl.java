package wrc.xy.service.message;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wrc.xy.dao.messageDao;
import wrc.xy.entity.message;

@Service
@Transactional
public class messageServiceImpl implements messageService{

	@Autowired
	private messageDao md;
	
	@Override
	public ArrayList<message> messageSelect(String receiveAccount) throws Exception {
		// TODO Auto-generated method stub
		return md.messageSelect(receiveAccount);
	}

	@Override
	public void messageAdd(message message) throws Exception {
		// TODO Auto-generated method stub
		md.messageAdd(message);
	}

	@Override
	public void messageDelete(message message) throws Exception {
		// TODO Auto-generated method stub
		md.messageDelete(message);
	}

	@Override
	public void messageEdit(message message) throws Exception {
		// TODO Auto-generated method stub
		md.messageEdit(message);
	}

}
