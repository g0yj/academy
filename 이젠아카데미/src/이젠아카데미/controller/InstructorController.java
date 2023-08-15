package 이젠아카데미.controller;

import 이젠아카데미.model.dao.InstructorDao;
import 이젠아카데미.model.dto.InstructorDto;
import 이젠아카데미.view.InstructorView;

public class InstructorController {

	private static InstructorController instructor = new InstructorController();
	public static InstructorController getInstance() {return instructor;}
	private InstructorController() {}
	
	

// 1. 강사vs행정을 구분하는 함수----------------------------	
	public boolean instructorMainn(int jno) {
		// MAINPAGE에서 받아온 값이
		//아이디,비밀번호 맞는 것 중 era? 직급이 "행정"이면 true;
		InstructorDto result=InstructorDao.getInstance().instructorMain(jno);
		if(result!=null) {
			return true;
		}
		else {return false;}
	
	
	
	}//f()
	
	
}//c
