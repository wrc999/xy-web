package wrc.xy.service.message;

import java.util.ArrayList;

import wrc.xy.entity.message;

public interface messageService {
		
	  public ArrayList<message> messageSelect(String receiveAccount) throws Exception;//消息查询
	  public void messageAdd(message message) throws Exception;//添加
	  public void messageDelete(message message) throws Exception;//删除
	  public void messageEdit(message message) throws Exception;//修改
}
