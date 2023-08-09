package 이젠아카데미.controller;

import 이젠아카데미.model.dao.StudentDao;
import 이젠아카데미.model.dto.StudentDto;

public class StudentController {
	
	private static StudentController c = new StudentController();
	public static StudentController getInstance() {return c;}
	private StudentController() {}

//메소드-----------------------------------------------
	public boolean studentJoin(String sname, int sage, String saddress) {
		StudentDto dto = new StudentDto(sname, sage, saddress);
		
		boolean result=
				StudentDao.getInstance().studentJoin(dto);
		return true;
		
	}//studentJoin()
	
	
	public StudentDto[] studentAllSelect() {
		StudentDto[] result = StudentDao.getInstance().studentAllSelect();
		
		return result;
	}
	
	public boolean studentDelete() {
		return StudentDao.getInstance().studentDelete(1231231);
		
	}
	

	
}//class
