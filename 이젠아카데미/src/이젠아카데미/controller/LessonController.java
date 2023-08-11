package 이젠아카데미.controller;

import 이젠아카데미.model.dao.LessonDao;
import 이젠아카데미.model.dto.LessonDto;

public class LessonController {
	// 0.싱글톤
	private static LessonController LessonController = new LessonController();
	public static LessonController getInstance() { return LessonController; }
	private LessonController() {}

//1. 수업등록(황기준)---------------------------------------------------------------------------	
	public boolean lessonWriteView(String lname,String ltname,String ltdate,String lopenday) {
		LessonDto lessonDto = new LessonDto(lname, ltname, ltdate, lopenday);
		boolean result = LessonDao.getInstance().lessonWriteView(lessonDto);
		if(result) {return true;}
		else{return false;}
	}//f()
	
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
