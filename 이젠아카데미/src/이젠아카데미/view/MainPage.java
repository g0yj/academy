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
<<<<<<< HEAD

			
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
=======
			try { 
				if(ch==1) {manager();}
				else if(ch==2) {student();} // 
				
				}catch (Exception e) {
					System.out.println("숫자로 입력하세요\n오류사유: "+e);
					sc = new Scanner(System.in);}
			return ;
		}//w
	}//f()
>>>>>>> branch '고연진' of https://github.com/g0yj/2ji
	
// 학생 눌렀을 때 선택되는 창 (고연진)--------------------------------------------------------	
	public void student() {
	//해당 학생을 확인할 수 있는 로그인 페이지 만들어야될듯?	
		//BoardView 페이지로 보냄
		//System.out.println(">>>>1.내정보 2.내가 쓴 글<<<<<");
		BoardView.getInstance().BoardMain();
	}
	
// 직원 선택했을 때 띄워지는 창 (고연진) ------------------------------------------------------
	public void manager() {
		System.out.println(">>>>>1. 학생관리 2. 수업관리 3. 게시판관리 4.출결관리<<<<<");
		System.out.print("선택: "); int select=sc.nextInt();
			if(select==1) {StudentView.getStudentView().studentMain();}
			else if(select==2){LessonView.getInstance().LessonMain();}
			else if(select==3){BoardView.getInstance().BoardMain();}
			else if(select==4){}
	}

}//class
