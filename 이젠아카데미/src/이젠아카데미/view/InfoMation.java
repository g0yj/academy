package 이젠아카데미.view;

import java.util.ArrayList;
import java.util.Scanner;

import 이젠아카데미.controller.AttendanceController;
import 이젠아카데미.controller.BoardController;
import 이젠아카데미.model.dto.BoardDto;

public class InfoMation {
	private static InfoMation infoMtion = new InfoMation();
	public static  InfoMation getInstance() {return infoMtion;}
	private InfoMation() {}
	
	private Scanner sc = new Scanner(System.in);
	public void InfoMationMenu() {
		System.out.println("1.게시판 2.출석하기 3.출석률확인 4. 뒤로가기"); int ch =sc.nextInt();
		
		if(ch==1) {board();}
		if(ch==2) { 출석하기(); }
		if(ch==3) { System.out.println("출석확인기능");}
		if(ch==4) {}
	}
	
	public void board() {
		BoardView.getInstance().boardPrint();
		System.out.println("1.내글보기 2. 글쓰기"); int select = sc.nextInt();
		
		if(select==1) {myWriting();}
		if(select==2) {boardWrite();}
	}
	// 1. 내글보기 메소드
	public void myWriting() {
		System.out.println("---------------------------------------- MyWriting LIST -------------------------------------");
		try {
		
			ArrayList<BoardDto> result=
					BoardController.getInstance().myWriting();
			
			System.out.printf("%-10s %-5s %-20s %-50s %-15s %-10s\n", "글번호", "학생번호", "제목", "내용", "작성일", "조회수");
			for(int i =0; i<result.size(); i++) {
				BoardDto dto = result.get(i);
				
				System.out.printf("%-10s %-12s %-20s %-50s %-15s %-10s\n",
	                    dto.getBno(), dto.getSno(), dto.getBtitle(), dto.getBcontent(), dto.getBday(), dto.getBview());
				System.out.println("------------------------------------------------------------------------------------------");
				
			}
		
		
		System.out.println("1. 글수정 2. 글삭제 3. 뒤로가기"); int ch= sc.nextInt();
		if (ch == 1) {
		    System.out.println("게시물번호: ");
		    int bno = sc.nextInt();
		    int sno = BoardController.getInstance().getLoginSession(); // 가정: 로그인된 사용자의 학번
		    boardUpdate(bno, sno);
		}
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
	public void boardUpdate(int bno, int sno) {
	
		System.out.println("수정할제목 >"); String title =sc.next();
		System.out.println("수정할내용 >"); String content =sc.next();
		
		
		int result =
				BoardController.getInstance().boardUpdate(bno, sno, title, content);
		
		if(result == 1) {System.out.println("안내] 글 수정 성공");}
		else if(result==2) {System.out.println("경고] 글 수정 실패 : 관리자 오류");}
		else if(result==3) {System.out.println("경고] 본인 글만 수정 가능합니다.");}
		else if(result==4) {System.out.println("경고] 수정할 제목을 1~50글자 사이로 입력해주세요.");}
	
		
		 
	}
	
	public void 출석하기() {
		boolean result = AttendanceController.getInstance().출석하기();
		if(result) {System.out.println(" 출석 완료 ");}
		else {System.out.println("이미 출석 했습니다.");}
	}
	
}
