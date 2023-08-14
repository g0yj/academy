package 이젠아카데미.view;

import java.util.Scanner;

import 이젠아카데미.controller.BoardController;

public class InfoMation {
	private static InfoMation infoMtion = new InfoMation();
	public static  InfoMation getInstance() {return infoMtion;}
	private InfoMation() {}
	
	private Scanner sc = new Scanner(System.in);
	public void InfoMationMenu() {
		System.out.println("1.게시판 2.출석률 3. 뒤로가기"); int ch =sc.nextInt();
		
		if(ch==1) {board();}
		if(ch==2) {}
		if(ch==3) {}
	}
	
	public void board() {
		BoardView.getInstance().boardPrint();
		System.out.println("1.내글보기 2. 글쓰기 3. 글수정 4. 글삭제"); int select = sc.nextInt();
		
		if(select==1) {}
		if(select==2) {boardWrite();}
		if(select==3) {}
		if(select==4) {
			System.out.println("게시물번호: "); int bno = sc.nextInt();
			boardDelete(bno);}
	}
	public void boardDelete(int bno) {
		System.out.print("1. 삭제 2. 취소"); int ch = sc.nextInt();
		
		if( ch == 1) {
		boolean result = BoardController.getInstance().boardDelete(bno);
		
			if(result) System.out.println("삭제 성공");
			else {System.out.println("삭제 실패");}
		} else if ( ch == 2) {
		}	
	}
	public void boardWrite() {
		System.out.println("--------- post write ----------");
		System.out.println("제목 >"); String title =sc.next();
		System.out.println("내용 >"); String content =sc.next();
		
		boolean result=
		BoardController.getInstance().boardWrite(title, content);
		if(result) {System.out.println("안내] 글쓰기 등록");}
		else {System.out.println("안내] 글쓰기 실패 : 제목 1~50 사이로 필수 입력");}
		BoardView.getInstance().boardPrint();
	}
}
