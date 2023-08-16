package 이젠아카데미.controller;

import 이젠아카데미.model.dao.AttendanceDao;

public class AttendanceController {
 
	private static AttendanceController attendanceController = new AttendanceController();
	public static AttendanceController getInstance() {return attendanceController;}
	private AttendanceController () {}
	
	public boolean 출석하기() {
		return AttendanceDao.getInstance().출석하기(BoardController.getInstance().getLoginSession());
	}
	
}
