package 이젠아카데미.view;

<<<<<<< HEAD
import java.util.ArrayList;
=======
import 이젠아카데미.controller.BoardController;

public class AttendanceView {
>>>>>>> branch 'main' of https://github.com/g0yj/2ji.git

<<<<<<< HEAD

import 이젠아카데미.controller.StudentController;
import 이젠아카데미.model.dto.StudentDto;

public class AttendanceView {
	private static AttendanceView adView = new AttendanceView();
	
	public static AttendanceView getInstance() { return adView; }
	
	private AttendanceView () {}

	
		
		
		public void attendancePrint() {
			ArrayList<StudentDto> result = StudentController.getInstance().attendancePrint();
			
			System.out.println("\n\n ===== 출석여부 =====");
			
			System.out.printf("%-3s %-4s %-15s %-10s %s \n","학생번호", "이름","주소","전화번호","수업코드");
			   for(int i = 0; i<result.size(); i++) {
				   StudentDto dto = result.get(i);	// i번째 객체를 호출
				   
				   System.out.printf("%-3s %-4s %-15s %-10s %s \n", dto.getSno(), dto.getSname() , dto.getSaddress(), dto.getSphone(),dto.getLno());
			   }
			
		}
	
	
	
		
=======
	private static AttendanceView adView = new AttendanceView();
	
	public static AttendanceView getInstance() { return adView;}
	
	private AttendanceView() {}

	public void attendanceMain() {
		
		BoardController.getInstance().attendanceView();
	}
	
	

>>>>>>> branch 'main' of https://github.com/g0yj/2ji.git
}
