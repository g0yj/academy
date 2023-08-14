package 이젠아카데미.view;

import java.util.Scanner;

import 이젠아카데미.controller.SignupController;

//회원가입

public class SignupView {

	private static SignupView sign = new SignupView();
	public static SignupView getInstance() {return sign;}
	private SignupView() {}
	
	Scanner sc= new Scanner(System.in);
	
// 1.회원가입-----------------------------------------------
	public void signup() {
		System.out.print("이름입력: "); 		String jname = sc.next();
		System.out.print("아이디입력: "); 		String jid = sc.next();
		System.out.print("비밀번호입력: ");	String jpw = sc.next();
		//유효성검사
		//1. 학생등록되어있는 학생에 한해 가능(sno 해결해야될듯)
		//2. 아이디 겹칠수 없음.
		boolean result=SignupController.getInstance().signup(jname,jid,jpw);
		if(result) {System.out.println("가입성공");}
		else {System.out.println("가입실패");}
		
	}//f()
	


	
	
	
	
}//c
