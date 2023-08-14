package 이젠아카데미.view;

import 이젠아카데미.controller.BoardController;

public class AttendanceView {

	private static AttendanceView adView = new AttendanceView();
	
	public static AttendanceView getInstance() { return adView;}
	
	private AttendanceView() {}

	public void attendanceMain() {
		
		BoardController.getInstance().attendanceView();
	}
	
	

}
