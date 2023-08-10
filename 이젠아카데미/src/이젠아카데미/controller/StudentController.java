package 이젠아카데미.controller;

import 이젠아카데미.model.dao.StudentDao;
import 이젠아카데미.model.dto.StudentDto;

public class StudentController {
	
	private static StudentController c = new StudentController();
	public static StudentController getInstance() {return c;}
	private StudentController() {}

//1.학생등록(고연진)-----------------------------------------------
	public boolean studentJoin(String sname, String saddress, String sphone,int lno) {
		StudentDto dto = new StudentDto(sname, saddress,sphone,lno);
		
		boolean result=
				StudentDao.getInstance().studentJoin(dto);
		return true;
		
	}//studentJoin()
	

	
	
//2. 학생정보조회(이진형)-----------------------------------------------------	
	public StudentDto[] studentAllSelect() {
		StudentDto[] result = StudentDao.getInstance().studentAllSelect();
		
		return result;
	}


//3. 학생수정업데이트(고연진)---------------------------------------------------	
	public StudentDto studentUpdate(int mno) {
		StudentDto result=StudentDao.getInstance().studentUpdate(mno);
		}
	
	
	
//4. 학생삭제(이진형)-----------------------------------------------------	
	public boolean studentDelete() {
		return StudentDao.getInstance().studentDelete(1231231);
		
	}
	

	
}//class
