package 이젠아카데미.controller;

import java.util.ArrayList;

import 이젠아카데미.model.dao.LessonDao;
import 이젠아카데미.model.dto.LessonDto;
import 이젠아카데미.model.dto.StudentDto;

public class LessonController {
	// 0.싱글톤
	private static LessonController LessonController = new LessonController();
	public static LessonController getInstance() { return LessonController; }
	private LessonController() {}
<<<<<<< HEAD
	
	//수업 등록--------------------------------------------------------------------
	public boolean lessonWriteView(String lname,String ltname,String ltdate,String lopenday) {
		
		LessonDto lessonDto = new LessonDto(0, lname, ltname, ltdate, lopenday);
		

		boolean result = LessonDao.getInstance().lessonWriteView(lessonDto);

=======
>>>>>>> branch '고연진' of https://github.com/g0yj/2ji

//1. 수업등록(황기준)---------------------------------------------------------------------------	
	public boolean lessonWriteView(String lname,String ltname,String ltdate,String lopenday) {
		LessonDto lessonDto = new LessonDto(lname, ltname, ltdate, lopenday);
		boolean result = LessonDao.getInstance().lessonWriteView(lessonDto);
		if(result) {return true;}
		else{return false;}
<<<<<<< HEAD
	}
	
	//수업 조회-------------------------------------------------------------------
	public ArrayList<LessonDto> lessonprintView() {
	
		
		
		
		return LessonDao.getInstance().lessonprintView();

	}
	
	//수업수정--------------------------------------------------------------------------
	
	public boolean lessonupdateView(int lno,String lname,String ltname,String ltdate,String lopenday) {
		
		LessonDto lessonDto = new LessonDto(lno, lname, ltname, ltdate, lopenday);
		boolean result = LessonDao.getInstance().lessonupdateView(lessonDto);
		
		return result;
	}
	
	
	//수업삭제--------------------------------------------------------------------------
	
	public boolean lessondeleteView(int lno) {
		
				boolean result = LessonDao.getInstance().lessondeleteView(lno);
				return result;
		
	}
	
	
	
	
=======
	}//f()
>>>>>>> branch '고연진' of https://github.com/g0yj/2ji
	
	//2.수업조회-----------------------------------------------------------------	
		public boolean lessonprintView() {
			
			return true;
			
		}

		
	//3. 수업 상세조회--------------------------------------------------------------	
		public boolean lessonupdateView() {
		
		
			return true;
		}
		

	//4. 수업삭제------------------------------------------------------------------
		public boolean lessondeleteView() {
		
			return true;
		
		}	
	
	
	
	
	
}//class
