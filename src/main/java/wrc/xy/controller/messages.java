package wrc.xy.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wrc.xy.entity.message;
import wrc.xy.service.message.messageService;

@RestController//包含@Controller和@ResponseBody
@RequestMapping("message")
public class messages {

	@Autowired
	private messageService ms;
	
	@RequestMapping("messageSelect")
	public ArrayList<message> messageSelect(String receiveAccount) throws Exception{
		  return ms.messageSelect(receiveAccount);
	  }
	@RequestMapping("messageAdd")
	public String messageAdd(message message) throws Exception {
		  ms.messageAdd(message);
		  return "1";
	  }
	@RequestMapping("messageDelete")
	public String messageDelete(message message) throws Exception {
		  ms.messageDelete(message);
		  return "1";
	  }
	@RequestMapping("messageEdit")
	public String messageEdit(message message) throws Exception {
		  ms.messageEdit(message);
		  return "1";
	  }
}
