package 이젠아카데미.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


import 이젠아카데미.controller.StudentController;
import 이젠아카데미.model.dto.StudentDto;

public class StudentView {
	
	

	Scanner sc = new Scanner(System.in);

	
	private static StudentView v= new StudentView();
	public static StudentView getStudentView() {return v;}
	private StudentView() {}

// 0. 메인페이지--------------------------------------------------------------------	
	public void studentMain() {
		while(true) {
		System.out.println("1.학생등록 2.학생정보조회 3.학생정보수정 4.학생삭제");
		System.out.print("선택: "); int ch= sc.nextInt();
		if(ch==1) {studentJoin();}//학생등록
		else if (ch==2) {studentAllSelect();}//학생조회
		else if(ch==3) {studentUpdate();}//학생수정
		else if(ch==4) {studentDelete();}//학생삭제
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
		
		System.out.println("\n\n ===== 학생 관리 =====");
		
		System.out.printf("%-3s %-4s %-15s %-10s %s \n","학생번호", "이름","주소","전화번호","수업코드");
		   for(int i = 0; i<result.size(); i++) {
			   StudentDto dto = result.get(i);	// i번째 객체를 호출
			   
			   System.out.printf("%-3s %-4s %-15s %-10s %s \n", dto.getSno(), dto.getSname() , dto.getSaddress(), dto.getSphone(),dto.getLno());
		   }
		
	}

	
//3. 학생정보수정(고연진)-----------------------------------------------------
	public void studentUpdate() {
		return;
	}//f()
	
	
	
//4. 학생삭제(이진형)----------------------------------------------------------------------
	public void studentDelete() {
		System.out.println("\n\n ===== student Delete =====");
			System.out.print("선택 ㄱ(숫자로 눌러) >");
		   
		   int ch = sc.nextInt();
		  
		   
		   System.out.print("해당 학생 진짜로 정말 삭제하시겠습니까? 1.예 2.아니요 :");
		   if(ch ==1) {
			   boolean result = StudentController.getInstance().studentDelete();
			   if(result) {
				   System.out.println("안내] 학생삭제성공");
				   
			   } else {
				   System.out.println("경고] 학생삭제실패");
			   }
		   }
	}
//--------------------------------------------------------------------	
	
}//class
