package 이젠아카데미.view;

import java.util.Scanner;

public class MainPage {

	private static MainPage mainpage= new MainPage();
	public static MainPage getInstance() {return mainpage;}
	private MainPage() {}
	
	private Scanner sc= new Scanner(System.in);
// 메인페이지-------------------------------------------------------------------
	public void mainPage() {
		while(true) {
			System.out.println("======================");
			System.out.println("1. 직원 2. 학생");
			System.out.println("======================");
			
			System.out.print("선택:  "); int ch= sc. nextInt();
			
			try { 
				if(ch==1) {
					System.out.println(">>>>>1. 학생관리 2. 수업관리 3. 게시판관리 4.출결관리<<<<<");
					System.out.print("선택: "); int select=sc.nextInt();
						if(select==1) {StudentView.getStudentView().studentMain();}
						else if(select==2){}
						else if(select==3){BoardView.getInstance().BoardMain();}
						else if(select==4){}
					}
				else if(ch==2) {System.out.println(">>>>1.내정보 2.내가 쓴 글<<<<<");
								//유효성 검사 필요. sql만들기
								System.out.print("회원이름입력: ");} // 
				
			} catch (Exception e) {System.out.println("숫자로 입력하세요\n오류사유: "+e);
				return ;
			}	
			
		}//while
		
	}//MainPage()
	
}//class
