package 이젠아카데미.view;

import java.util.Scanner;

import 이젠아카데미.controller.LessonController;

public class LessonView {
	// 0. 싱글톤
	private static LessonView LessonView = new LessonView();
	public static LessonView getInstance() { return LessonView; }
	private LessonView() {}
	
	private Scanner sc = new Scanner(System.in);
	
	public void LessonMain(){	
	while(true) {
		System.out.println("================수업관리===============");
		System.out.println("1.수업 등록 2.수업 조회 3.수업 수정 4.수업 삭제");
		System.out.println("선택>>>");
		int ch = sc.nextInt();
		

		if(ch==1) {lessonwriteView();}//수업등록
		if(ch==2) {lessonprintView();}//수업조회
		if(ch==3) {lessonupdateView();}//수업수정
		if(ch==4) {lessondeleteView();}//수업삭제


		}// while e
	}

//1.수업등록-------------------------------------------------------------------	
	public void lessonwriteView() {
		sc.nextLine();
		System.out.println("수업명 : ");		String lname = sc.nextLine();
		System.out.println("강사명 : ");		String ltname = sc.nextLine(); 
		System.out.println("총수강일 : ");		String ltdate = sc.nextLine();
		System.out.println("개강일 : ");		String lopenday = sc.nextLine();

		boolean result = LessonController.getInstance().lessonWriteView(lname,ltname,ltdate,lopenday);

		if(result) {System.out.println("수업등록 성공");}
		else {System.out.println("수업등록 실패");}
	
	}
	
//2.수업조회-----------------------------------------------------------------	
	public boolean lessonprintView() {
		
		return true;
		
	}

	
//3. 수업 상세조회--------------------------------------------------------------	
	public boolean lessonupdateView() {
	
	
		return true;
	}
	

//4. 수업삭제------------------------------------------------------------------
	public boolean lessondeleteView() {
	
		return true;
	
	}
	
}// class e
