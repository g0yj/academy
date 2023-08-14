package 이젠아카데미.view;



import java.util.Scanner;

import 이젠아카데미.controller.SignupController;


public class SignupView {

	private static SignupView sign = new SignupView();
	public static SignupView getInstance() {return sign;}
	private SignupView() {}
	
	Scanner sc= new Scanner(System.in);
	
// 1.강사회원가입-----------------------------------------------
	public void signup() {
		System.out.print("이름입력: "); 		int eno = sc.nextInt();
		System.out.print("아이디입력: "); 		String jid = sc.next();
		System.out.print("비밀번호입력: ");	String jpw = sc.next();
		//유효성검사
	
		boolean result=SignupController.getInstance().signup(eno,jid,jpw);
		
		if(result) {System.out.println("가입성공");}
		else {System.out.println("가입실패");}
		
	}//f()
	


	
	
	
	
}//c
