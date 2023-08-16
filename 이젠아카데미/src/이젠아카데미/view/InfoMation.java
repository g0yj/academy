package 이젠아카데미.view;

import java.util.ArrayList;
import java.util.Scanner;

import 이젠아카데미.controller.BoardController;
import 이젠아카데미.model.dto.BoardDto;

public class InfoMation {
	private static InfoMation infoMtion = new InfoMation();
	public static  InfoMation getInstance() {return infoMtion;}
	private InfoMation() {}
	
	private Scanner sc = new Scanner(System.in);
	public void InfoMationMenu() {
		System.out.println("1.게시판 2.출석 3. 뒤로가기"); int ch =sc.nextInt();
		
		if(ch==1) {board();}
		if(ch==2) {}
		if(ch==3) {}
	}
	
	public void board() {
		BoardView.getInstance().boardPrint();
		System.out.println("1.내글보기 2. 글쓰기"); int select = sc.nextInt();
		
		if(select==1) {myWriting();}
		if(select==2) {boardWrite();}
	}
	// 1. 내글보기 메소드
	public void myWriting() {
		System.out.println("----- MyWriting VIEW -------");
		try {
		
			ArrayList<BoardDto> result=
					BoardController.getInstance().myWriting();
			System.out.println("---------------------------------------- MyWriting LIST -------------------------------------");
			System.out.printf("%13s %13s %10s %26s %32s %25s \n","bno","sno","title","content","day","view");
			for(int i =0; i<result.size(); i++) {
				BoardDto dto = result.get(i);
				
				System.out.printf("%13s %13s %10s %30s %17s %25s \n",
						dto.getBno(),dto.getSno(),dto.getBtitle(),dto.getBcontent(), dto.getBday(),dto.getBview());
				System.out.println("------------------------------------------------------------------------------------------");
				
			}
		
		
		System.out.println("1. 글수정 2. 글삭제 3. 뒤로가기"); int ch= sc.nextInt();
		if(ch==1) {boardUpdate();}
		if(ch==2) {
			System.out.println("게시물번호: "); int bno = sc.nextInt();
			boardDelete(bno);}
		if(ch==3) {board();}
		}catch (Exception e) {System.out.println("오류알려줘"+e);}
	}
		
	
	public void boardWrite() {
		System.out.println("--------- post write ----------");
		System.out.println("제목 >"); String title =sc.next();
		System.out.println("내용 >"); String content =sc.next();
		
		BoardView.getInstance().boardPrint();
		boolean result=
		BoardController.getInstance().boardWrite(title, content);
		if(result) {System.out.println("안내] 글쓰기 등록");board();}
		else {System.out.println("안내] 글쓰기 실패 : 제목 1~50 사이로 필수 입력");}	
	}
	
	public void boardDelete(int bno) {
		System.out.print("1. 삭제 2. 취소"); int ch = sc.nextInt();
		
		if( ch == 1) {
		boolean result = BoardController.getInstance().boardDelete(bno);
		
			if(result) { System.out.println("삭제 성공");
			InfoMationMenu();}
			else {System.out.println("삭제 실패");}
		} else if ( ch == 2) {InfoMationMenu();}	
	}
	public void boardUpdate() {
		
	}
}
