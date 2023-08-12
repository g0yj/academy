package 이젠아카데미.view;

import java.util.ArrayList;
import java.util.Scanner;

import 이젠아카데미.controller.StudentController;
import 이젠아카데미.model.dto.StudentDto;

public class StudentView {
	
	

	private Scanner sc = new Scanner(System.in);

	
	private static StudentView v= new StudentView();
	public static StudentView getStudentView() {return v;}
	private StudentView() {}

// 0. 메인페이지--------------------------------------------------------------------	
	public void studentMain() {
		while(true) {
		System.out.println("1.학생등록 2.학생정보조회 3.학생정보수정 4.학생삭제 5.초기화면 6.로그인");
		System.out.print("선택: "); int ch= sc.nextInt();
		if(ch==1) {studentJoin();}//학생등록
		else if (ch==2) {studentAllSelect();}//학생조회
		else if(ch==3) {studentUpdate();}//학생수정
		else if(ch==4) {studentDelete();}//학생삭제
		else if(ch==5) {MainPage.getInstance().mainPage();}
		else if(ch==6) {studentLogin();}
		}//while
	}
	
//1. 학생등록(고연진)---------------------------------------------------------------------	
	public void studentJoin() {
		System.out.print("이름: "); String sname =sc.next();
		System.out.print("주소: "); String saddress =sc.next();
		System.out.print("번호: "); String sphone =sc.next();
		System.out.print("수업코드: "); int lno =sc.nextInt();
		
		boolean result= 
				StudentController.getInstance().studentJoin(sname,saddress,sphone,lno);
		
		if(result) {
			System.out.println("학생 등록");}
		else {System.out.println("학생등록 실패");}	
	}//studentJoin()

	
//2. 학생정보조회(이진형)-------------------------------------------	
	public void studentAllSelect() {
		ArrayList<StudentDto> result = StudentController.getInstance().studentAllSelect();
		
		System.out.println("\n\n ===== 학생 조회 =====");
		
		System.out.printf("%-3s %-4s %-15s %-10s %s \n","학생번호", "이름","주소","전화번호","수업코드");
		   for(int i = 0; i<result.size(); i++) {
			   StudentDto dto = result.get(i);	// i번째 객체를 호출
			   
			   System.out.printf("%-3s %-4s %-15s %-10s %s \n", dto.getSno(), dto.getSname() , dto.getSaddress(), dto.getSphone(),dto.getLno());
		   }
		
	}

	
//3. 학생정보수정(고연진)-----------------------------------------------------
	public void studentUpdate() {
	
		studentAllSelect();
		
		System.out.println("학생번호: "); int sno=sc.nextInt();
		System.out.println("이름: "); String sname=sc.next();
		System.out.println("주소: "); String saddress=sc.next();
		System.out.println("전화번호: "); String sphone=sc.next();
		System.out.println("수업코드: "); int lno=sc.nextInt();
			
		boolean result = 
				StudentController.getInstance().studentUpdate(sno,sname,saddress,sphone,lno);
		
		if(result) {System.out.println("학생정보수정성공");}
		
		studentAllSelect();
	}//f()
	
	
	
//4. 학생삭제(이진형)----------------------------------------------------------------------
	public void studentDelete() {
		
			studentAllSelect();
			System.out.println("\n\n ===== 학생 삭제 =====");
			System.out.print("삭제할 학생을 선택하세요. >"); int sno = sc.nextInt();
		   
		   System.out.print("해당 학생을 삭제하시겠습니까? 1.예 2.아니요 :"); int ch = sc.nextInt();
		   if(ch ==1) {
			   boolean result = StudentController.getInstance().studentDelete(sno);
			   	if(result) { System.out.println("안내] 학생삭제성공");} 
			   	else { System.out.println("경고] 학생삭제취소");}
		   }//if
	}//f()
// 5. 학생로그인 (고연진)--------------------------------------------------------------------	
	public void studentLogin() {
		System.out.print("학생코드: "); int sno = sc.nextInt();
		System.out.print("학생이름: "); String sname = sc.next();
		boolean result = StudentController.getInstance().studentLogin(sno,sname);
		if(result) {System.out.println("학생확인성공\n" +"학생코드: "+sno +"\n학생이름:"+sname);}
		else {System.out.println("[학생확인실패] 학생코드와 이름을 확인해주세요");}
	}//f()
	
}//class
