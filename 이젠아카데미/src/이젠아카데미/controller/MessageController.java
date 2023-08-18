package 이젠아카데미.controller;

import java.util.ArrayList;

import 이젠아카데미.model.dao.MessageDao;
import 이젠아카데미.model.dto.MessageDto;

public class MessageController {

	private static MessageController M = new MessageController();
	public static MessageController getInstance() {return M;}
	private MessageController() {}

//메세지보내기(고연진)------------------------------------------------------	
	public boolean messageSend(int eno, String mcontent, int sno) {
		
		MessageDto dto = new MessageDto(eno, mcontent, sno);
		
		boolean result= MessageDao.getInstance().messageSend(dto);
			
		if(result) {System.out.println("메세지보내기성공"); return true; }
		else {System.out.println("메세지보내기실패");return false;}
	
	}//f()
	
//보낸쪽지함(고연진)----------------------------------------------------------
	public ArrayList<MessageDto> messageView(int eno) {
		ArrayList<MessageDto> result= MessageDao.getInstance().messageView(eno);
		return result;
		}
	
	
	
	
}//c

