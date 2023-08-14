package 이젠아카데미.controller;

import 이젠아카데미.model.dao.SignupDao;
import 이젠아카데미.model.dto.SignupDto;

public class SignupController {

	private static SignupController sign = new SignupController();
	public static SignupController getInstance() {return sign;}
	private SignupController() {}
	
	
// 1.강사회원가입-----------------------------------------------
	public boolean signup(int eno, String jid, String jpw) {
		SignupDto dto = new SignupDto(eno, jid, jpw);
		
		
		boolean result =SignupDao.getInstance().signup(dto);
		
		if(result) {return true;}
		else {return false;}
		
	}//f()	
	
	
}//c
