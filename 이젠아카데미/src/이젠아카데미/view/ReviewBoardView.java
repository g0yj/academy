package 이젠아카데미.view;

import java.util.Scanner;

import 이젠아카데미.controller.BoardController;
import 이젠아카데미.controller.ReviewBoardController;

public class ReviewBoardView {
	private static ReviewBoardView ReviewBoardView= new ReviewBoardView();
	public static ReviewBoardView getInstance() { return ReviewBoardView; }
	private ReviewBoardView() {}
	
	private Scanner sc = new Scanner(System.in);
	
	public void ReviewBoardMain() {
		
		while(true) {
			System.out.println("================후기게시판===============");
			System.out.println("1.글쓰기 2.글 전체조회 3.내글 조회 4.글 수정 5.글  삭제 6. 뒤로가기");
			System.out.println("선택 >>>");
			int ch = sc.nextInt();
			
			if(ch==1) {reviewWrite();} // 1.글쓰기
			if(ch==2) {reviewTotalView();} // 2. 글 전체조회
			if(ch==3) {reviewIndividualView();} // 3. 내 글 조회
			if(ch==4) {reviewUpdate();} // 4. 글 수정
			if(ch==5) {reviewDelete();} // 5. 글 삭제
			if(ch==6) {InfoMation.getInstance().InfoMationMenu();} // 5. 글 삭제
	
		}// while e
		
	}// main e
	
// 1. 글쓰기-----------------------------------------------------------------

	public void reviewWrite() {
		System.out.println("--------- review write ----------");
		System.out.println("제목 : "); String rtitle = sc.next();
		System.out.println("내용 : "); String rcontent = sc.next();
		System.out.println("평점 : "); int rgrade = sc.nextInt();
		// 여기에 수업코드를 넣는건가.
		
		reviewTotalView(); // 글 전체조회 보여주기
		
		boolean result = ReviewBoardController.getInstance().reviewWrite(rtitle,rcontent,rgrade);
		if(result) {System.out.println("안내] 글쓰기 등록");InfoMation.getInstance().InfoMationMenu();}
		else {System.out.println("안내] 글쓰기 실패 : 제목 1~50 사이로 필수 입력");}
		
		

		
	}

	
// 2. 글 전체조회-----------------------------------------------------------------	

	public void reviewTotalView() {
	
		
	}
	
	
// 3. 내글 조회-----------------------------------------------------------------

	public void reviewIndividualView() {
		
		
	}
	
	
// 4. 글 수정-----------------------------------------------------------------

	public void reviewUpdate() {
		
		
	}
	
	
// 5. 글 삭제 -----------------------------------------------------------------
	
	public void reviewDelete() {
		
		
	}
	
	
	
}// class e
