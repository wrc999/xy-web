package wrc.xy.service.talks;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wrc.xy.dao.talkDao;
import wrc.xy.entity.replytalk;
import wrc.xy.entity.talk;
import wrc.xy.entity.topic;
import wrc.xy.entity.praise;


@Service
@Transactional
public class talkServiceImpl implements talkService {
	@Autowired
	private talkDao td;

	@Override
	public ArrayList<talk> talkFind(talk talk) throws Exception {
		return td.talkSelect(talk);
	}

	@Override
	public void talkAdd(talk talk) throws SQLException {
		// TODO Auto-generated method stub
		td.talkAdd(talk);
	}

	@Override
	public void talkDel(talk talk) throws Exception {
		// TODO Auto-generated method stub
		td.talkDelete(talk);
	}

	@Override
	public List<replytalk> replyFind() throws Exception {
		// TODO Auto-generated method stub
		return td.replySelect();
	}

	@Override
	public List<praise> praiseFind() throws Exception {
		// TODO Auto-generated method stub
		return td.praiseSelect();
	}

	@Override
	public void praiseAdd(praise praise) {
		// TODO Auto-generated method stub
		td.praiseInsert(praise);
	}


	@Override
	public void replyAdd(replytalk reply) throws Exception {
		// TODO Auto-generated method stub
		td.replyTalkAdd(reply);
	}

	@Override
	public talk talkUpdate(talk talk) throws Exception {
		// TODO Auto-generated method stub
		td.talkUpdate(talk);
		return td.talkSelect(talk).get(0);
	}

	@Override
	public void praiseDelete(praise praise) {
		// TODO Auto-generated method stub
		td.praiseDelete(praise);
	}

	@Override
	public void topicAdd(topic topic) {
		// TODO Auto-generated method stub
		td.topicAdd(topic);
	}

	@Override
	public ArrayList<topic> topicGet(topic topic) {
		// TODO Auto-generated method stub
		ArrayList<topic> topicList = td.topicGet(topic);
		for(topic t:topicList) {
			t.setTopicJoins(td.getTopicJoins(t.getTopicName()));
		}
		return topicList;
	}

	@Override
	public void topicEdit(topic topic) {
		// TODO Auto-generated method stub
		td.topicEdit(topic);
	}

	@Override
	public void topicDelete(topic topic) {
		// TODO Auto-generated method stub
		td.topicDelete(topic);
	}

}
