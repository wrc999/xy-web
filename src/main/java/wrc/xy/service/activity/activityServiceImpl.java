package wrc.xy.service.activity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wrc.xy.dao.activityDao;
import wrc.xy.entity.activity;
import wrc.xy.entity.activityjoins;
import wrc.xy.entity.activitypraise;
import wrc.xy.entity.userinfo;
import wrc.xy.service.user.userService;


@Service
@Transactional
public class activityServiceImpl implements activityService {
	@Autowired
	private activityDao ad;
	@Autowired
	private userService us;

	@Override
	public void add(activity activity) {
		// TODO Auto-generated method stub
		ad.add(activity);
		activityjoins a = new activityjoins();
		a.setActivity_id(activity.getActivity_id());
		a.setAccount(activity.getAccount());
		ad.joinsAdd(a);
	}

	@Override
	public void delete(activity activity) {
		// TODO Auto-generated method stub
		ad.delete(activity);
	}
	
	@Override
	public List<activity> activitySearch(String name) {
		// TODO Auto-generated method stub
		List<activity> activities = ad.activitySearch(name);;
		List<activitypraise> praise = ad.praiseGet(0);
		List<activityjoins> joins = ad.joinsGet(0);
		for(int i=0;i<activities.size();i++) {
			ArrayList<String> joinPeople = new ArrayList<String>();
			for(int j=0;j<praise.size();j++) {
				if(activities.get(i).getActivity_id()==praise.get(j).getActivity_id()) {
					joinPeople.add(praise.get(j).getAccount());
				}
				activities.get(i).setaAccount(joinPeople);
			}
		}
		for(int i=0;i<activities.size();i++) {
			ArrayList<String> joinPeople = new ArrayList<String>();
			for(int j=0;j<joins.size();j++) {
				if(activities.get(i).getActivity_id()==joins.get(j).getActivity_id()) {
					joinPeople.add(joins.get(j).getAccount());
				}
				activities.get(i).setjAccount(joinPeople);
			}
		}
		return activities;
	}
	
	@Override
	public activity getByActivityId(Integer activity_id) {
		// TODO Auto-generated method stub
		activity activity = ad.getByactivityId(activity_id);
		List<activitypraise> praise = ad.praiseGet(activity_id);
		List<activityjoins> joins = ad.joinsGet(activity_id);
		ArrayList<String> joinPeople = new ArrayList<String>();
		ArrayList<String> praisePeople = new ArrayList<String>();
		for(int j=0;j<joins.size();j++) {
				joinPeople.add(joins.get(j).getAccount());
		}
		for(int j=0;j<praise.size();j++) {
			praisePeople.add(praise.get(j).getAccount());
		}
		activity.setjAccount(joinPeople);
		activity.setaAccount(praisePeople);
		return activity;
	}
	
	@Override
	public List<activity> getByAccount(String account) {
		// TODO Auto-generated method stub
		List<activity> activities = ad.getByAccount(account);
		List<activitypraise> praise = ad.praiseGet(0);
		List<activityjoins> joins = ad.joinsGet(0);
		for(int i=0;i<activities.size();i++) {
			ArrayList<String> joinPeople = new ArrayList<String>();
			for(int j=0;j<praise.size();j++) {
				if(activities.get(i).getActivity_id()==praise.get(j).getActivity_id()) {
					joinPeople.add(praise.get(j).getAccount());
				}
				activities.get(i).setaAccount(joinPeople);
			}
		}
		for(int i=0;i<activities.size();i++) {
			ArrayList<String> joinPeople = new ArrayList<String>();
			for(int j=0;j<joins.size();j++) {
				if(activities.get(i).getActivity_id()==joins.get(j).getActivity_id()) {
					joinPeople.add(joins.get(j).getAccount());
				}
				activities.get(i).setjAccount(joinPeople);
			}
		}
		return activities;
	}

	@Override
	public void joinsAdd(activityjoins a) {
		// TODO Auto-generated method stub
		ad.joinsAdd(a);
	}


	@Override
	public void joinsDelete(activityjoins ajoins) {
		// TODO Auto-generated method stub
		ad.joinsDelete(ajoins);
	}

	@Override
	public List<userinfo> getActivityJoins(Integer activity_id) {
		// TODO Auto-generated method stub
		List<activityjoins> joins = ad.joinsGet(activity_id);
		List<userinfo> joinsList = new ArrayList<userinfo>();
		for(activityjoins a:joins) {
			userinfo u = new userinfo();
			u.setAccount(a.getAccount());
			joinsList.add(us.userGet(u));
		}
		return joinsList;
	}

	@Override
	public int praiseAdd(activitypraise a) {
		// TODO Auto-generated method stub
		ad.praiseAdd(a);
		return ad.praiseGet(a.getActivity_id()).size();
	}

	@Override
	public int praiseDelete(activitypraise praise) {
		// TODO Auto-generated method stub
		ad.praiseDelete(praise);
		return ad.praiseGet(praise.getActivity_id()).size();
	}

	@Override
	public List<activity> getOnLine(String account) {
		// TODO Auto-generated method stub
		List<activity> activities = ad.getOnLine(account);
		List<activitypraise> praise = ad.praiseGet(0);
		List<activityjoins> joins = ad.joinsGet(0);
		for(int i=0;i<activities.size();i++) {
			ArrayList<String> joinPeople = new ArrayList<String>();
			for(int j=0;j<praise.size();j++) {
				if(activities.get(i).getActivity_id()==praise.get(j).getActivity_id()) {
					joinPeople.add(praise.get(j).getAccount());
				}
				activities.get(i).setaAccount(joinPeople);
			}
		}
		for(int i=0;i<activities.size();i++) {
			ArrayList<String> joinPeople = new ArrayList<String>();
			for(int j=0;j<joins.size();j++) {
				if(activities.get(i).getActivity_id()==joins.get(j).getActivity_id()) {
					joinPeople.add(joins.get(j).getAccount());
				}
				activities.get(i).setjAccount(joinPeople);
			}
		}
		return activities;
	}

	@Override
	public List<activity> getUnderLine(String account) {
		// TODO Auto-generated method stub
		List<activity> activities = ad.getUnderLine(account);
		List<activitypraise> praise = ad.praiseGet(0);
		List<activityjoins> joins = ad.joinsGet(0);
		for(int i=0;i<activities.size();i++) {
			ArrayList<String> joinPeople = new ArrayList<String>();
			for(int j=0;j<praise.size();j++) {
				if(activities.get(i).getActivity_id()==praise.get(j).getActivity_id()) {
					joinPeople.add(praise.get(j).getAccount());
				}
				activities.get(i).setaAccount(joinPeople);
			}
		}
		for(int i=0;i<activities.size();i++) {
			ArrayList<String> joinPeople = new ArrayList<String>();
			for(int j=0;j<joins.size();j++) {
				if(activities.get(i).getActivity_id()==joins.get(j).getActivity_id()) {
					joinPeople.add(joins.get(j).getAccount());
				}
				activities.get(i).setjAccount(joinPeople);
			}
		}
		return activities;
	}

	@Override
	public List<activity> getExamine(Integer online) {
		// TODO Auto-generated method stub
		List<activity> activities = ad.getExamine(online);
		ArrayList<String> temp = new ArrayList<String>();
		for(activity a:activities) {
			a.setaAccount(temp);
			a.setjAccount(temp);
		}
		return activities;
	}

	@Override
	public List<activity> getFalseExamine(Integer online) {
		// TODO Auto-generated method stub
		List<activity> activities = ad.getFalseExamine(online);
		ArrayList<String> temp = new ArrayList<String>();
		for(activity a:activities) {
			a.setaAccount(temp);
			a.setjAccount(temp);
		}
		return activities;
	}

	@Override
	public void edit(activity activity) {
		// TODO Auto-generated method stub
		ad.edit(activity);
	}

	@Override
	public ArrayList<activity> getAdminExamine(String name) {
		// TODO Auto-generated method stub
		ArrayList<activity> activities = ad.getAdminExamine(name);
		ArrayList<String> temp = new ArrayList<String>();
		for(activity a:activities) {
			a.setaAccount(temp);
			a.setjAccount(temp);
		}
		return activities;
	}
}
