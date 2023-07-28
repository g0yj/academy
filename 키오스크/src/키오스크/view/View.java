package 키오스크.view;

import java.util.Scanner;

import 키오스크.Controller.Controller;


public class View {// 입출력 담당하는 클래스 // view -> HTML/JS
	   // 0. 싱글톤 생성
	   // 1. 현재 클래스로 에 static 객체 생성 , 필드는 무조건 잠금 
	private static View view = new View();
	   // 2. 외부 객체에서 해당 싱글톤 호출하기 위한 메소드 
	public static View getInstance() { return view; }
	   // 3. 객체 외부에서 해당 클래스로 객체 생성 잠금 , 생성자를 private 
	private View() { }
	
	// 1. 필드
	private Scanner sc = new Scanner(System.in); 
	
	// 2. 생성자
	
	// 3. 함수 
	public void view() {
	   while(true) { // 무한루프
	      System.out.println("\n\n--------- 제품번호 ---------");
	      System.out.print("1.음료 고르기");
	      int ch = sc.nextInt();
	      if( ch == 1 ) { inputNumber(); }
	     
	   } // while e 
	} // f end 
	
	public void inputNumber() {
		System.out.println("0.콜라 1.사이다 2.환타"); int no=sc.nextInt();
		String result = Controller.getInstance().inputNumLogic(no);
		System.out.println(result);
	}
	

}




