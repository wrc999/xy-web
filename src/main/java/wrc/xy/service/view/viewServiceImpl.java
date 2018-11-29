package wrc.xy.service.view;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wrc.xy.dao.viewDao;
import wrc.xy.entity.view;

@Service
@Transactional
public class viewServiceImpl implements viewService {
	@Autowired
	private viewDao vd;

	@Override
	public void add(view v) {
		// TODO Auto-generated method stub
		vd.add(v);
	}

	@Override
	public void delete(view v) {
		// TODO Auto-generated method stub
		vd.delete(v);
	}

	@Override
	public ArrayList<view> get(view v) {
		// TODO Auto-generated method stub
		return vd.get(v);
	}

	@Override
	public view viewUpdate(view v) {
		// TODO Auto-generated method stub
		vd.viewUpdate(v);
		return vd.get(v).get(0);
	}

}
