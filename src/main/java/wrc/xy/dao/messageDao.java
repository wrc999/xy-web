package wrc.xy.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import wrc.xy.entity.message;

public interface messageDao {
	
	  public ArrayList<message> messageSelect(String receiveAccount) throws SQLException;//消息查询
	  public void messageAdd(message message) throws SQLException;//添加
	  public void messageDelete(message message) throws SQLException;//删除
	  public void messageEdit(message message) throws SQLException;//修改
	
}
