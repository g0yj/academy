package 이젠아카데미.controller;

import 이젠아카데미.model.dao.LessonDao;
import 이젠아카데미.model.dto.LessonDto;

public class LessonController {
	// 0.싱글톤
	private static LessonController LessonController = new LessonController();
	public static LessonController getInstance() { return LessonController; }
	private LessonController() {}
	
	public boolean lessonWriteView(String lname,String ltname,String ltdate) {
		
<<<<<<< HEAD
		LessonDto lessonDto = new LessonDto(0,lname,ltname,ltdate);
=======
		LessonDto lessonDto = new LessonDto(lname, ltname, ltdate);
>>>>>>> branch 'main' of https://github.com/g0yj/2ji
		
<<<<<<< HEAD
		boolean result = LessonDao.getInstance().lessonWriteView(dto);
=======

		LessonDto result = LessonDao.getInstance().lessonWriteView();
>>>>>>> branch 'main' of https://github.com/g0yj/2ji
		
<<<<<<< HEAD
		if(result) {return true;}
		else{return false;}
	}
=======
	//}
>>>>>>> branch 'main' of https://github.com/g0yj/2ji
	
	
}
