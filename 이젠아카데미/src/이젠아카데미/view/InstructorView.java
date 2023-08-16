package 이젠아카데미.view;
//강사, 행정 나눠서 학생 정보 볼 수 있는 페이지


import java.util.Scanner;

import 이젠아카데미.controller.InstructorController;
import 이젠아카데미.controller.SignupController;



public class InstructorView {
	private static InstructorView instructor = new InstructorView();
	public static InstructorView getInstance() {return instructor;}
	private InstructorView() {}
	
	private Scanner sc = new Scanner(System.in);
	

//1. mainpage 직원(강사,행정) 인지 확인 보여주는 페이지---------------------------------------------------------	
	//강사면 수업 듣는 학생의 전체보기 
	public void instructorMain() {
/*
 *loginSession 값의 jno의 분류 필드에서 강사와 일치한걸 가져옴
 **/
		int jno = SignupController.getInstance().getLoginSession();
		
		boolean result= InstructorController.getInstance().instructorMainn(jno);
		
		//1. 만약 강사로 들어왔으면 수강 중인 학생 정보만 보여주기
		if(result) {
			System.out.println("강사로 로그인 성공");
			SManagement();}
		else {// 행정으로 로그인하면 전체 출력
			System.out.println("행정 로그인 성공");
			StudentView.getStudentView().studentAllSelect();
			}
			
	}//f()

	
//-----------------------------------------------------------------
//2. 강사변 수업을 듣는 학생 전체를 보여주는 view
	////sql문, select , 직급이 강xx로 되어있으면 , 강사와 맞는 학생 
	public void SManagement() {//
		
	};
	

	
	

}//c
