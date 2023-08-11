package 이젠아카데미.controller;

import 이젠아카데미.model.dao.LessonDao;
import 이젠아카데미.model.dto.LessonDto;

public class LessonController {
	// 0.싱글톤
	private static LessonController LessonController = new LessonController();
	public static LessonController getInstance() { return LessonController; }
	private LessonController() {}
	
	public boolean lessonWriteView(String lname,String ltname,String ltdate) {
		
		LessonDto lessonDto = new LessonDto(lname, ltname, ltdate);
		
		LessonDto result = LessonDao.getInstance().lessonWriteView();
		
	}
	
	
}
