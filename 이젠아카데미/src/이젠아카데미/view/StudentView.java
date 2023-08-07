package 이젠아카데미.view;

import java.util.Scanner;

import 이젠아카데미.controller.StudentController;

public class StudentView {
	
	Scanner sc = new Scanner(System.in);
	
	private static StudentView v= new StudentView();
	public static StudentView getStudentView() {return v;}
	private StudentView() {}

//메소드--------------------------------------------------------------------	
	public void studentMain() {
		while(true) {
		System.out.println("1.학생등록 2.학생정보조회 3.학생정보수정 4.학생삭제");
		System.out.println("선택: "); int ch= sc.nextInt();
		if(ch==1) {studentJoin();}//학생등록
	//	else if (ch==2) {StudentCheck();}//학생d조회
	//	else if(ch==3) {StudentUpdate();}//학생수정
	//	else if(ch==4) {StudentDelete();}//학생삭제
		}//while
	}
	
	public void studentJoin() {
		System.out.println("이름: "); String sname =sc.next();
		System.out.println("나이: "); int sage =sc.nextInt();
		System.out.println("주소: "); String saddress =sc.next();
		
		boolean result= 
				StudentController.getInstance().studentJoin(sname,sage,saddress);
		
		if(result) {
			System.out.println("학생 등록");
		}
		else {System.out.println("학생등록 실패");}
		
		
	}//studentJoin()
	
	
	
	
}//class
