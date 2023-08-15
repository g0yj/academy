package 이젠아카데미.view;
//강사, 행정 나눠서 학생 정보 볼 수 있는 페이지


import java.util.Scanner;



public class InstructorView {
	private static InstructorView instructor = new InstructorView();
	public static InstructorView getInstance() {return instructor;}
	private InstructorView() {}
	
	private Scanner sc = new Scanner(System.in);
	

//1. 직원(강사,행정) 이면 보여주는 페이지---------------------------------------------------------	
	//강사면 수업 듣는 학생의 전체보기 
	public void instructorMain() {
		System.out.println("강사인지 행정인지 확인");
		boolean result=true;
		//1. 만약 행정이 들어왔으면 전체 보여주기(강사가 아니면)
		if(true) {
			System.out.println("행정으로 로그인 성공");
			StudentView.getStudentView().studentAllSelect();
		System.out.print("학생코드 입력: "); int sno = sc.nextInt();
		
		}
		else {return;}//SManagement(); //강사면 보여지는 페이지
		
		//2. 강사가 들어왔으면 수업을 듣는 학생만 보여주기
			
		
	}//f()
	
//2. 강사변 수업을 듣는 학생 전체를 보여주는 view
	////sql문, select , 직급이 강xx로 되어있으면 , 강사와 맞는 학생 
	public void SManagement() {//
		
	};
	

	
	

}//c
