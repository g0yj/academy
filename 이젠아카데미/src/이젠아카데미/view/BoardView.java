package 이젠아카데미.view;

import java.util.ArrayList;
import java.util.Scanner;

import 이젠아카데미.controller.BoardController;
import 이젠아카데미.model.dto.BoardDto;



public class BoardView {
	private static BoardView boardView = new BoardView();
	public static BoardView getInstance() {return boardView;}
	private BoardView() {}
	
	private Scanner sc = new Scanner(System.in);
	
	public void BoardMain() {
		while(true) {
			boardPrint(); 
			System.out.println("1.글조회 2.글삭제 3. 뒤로가기");int ch = sc.nextInt();
			if(ch==1) {boardView();}
			if(ch==2) { boardDelete();}
			if(ch==3) {}
			
		}
	}
	public void boardPrint() {
		
		ArrayList<BoardDto> result=
				BoardController.getInstance().boardPrint();
		System.out.println("---------------------------------------- POST LIST -------------------------------------");
		System.out.printf("%13s %13s %10s %26s %32s \n","bno","sno","title","day","view");
		for(int i =0; i<result.size(); i++) {
			BoardDto dto = result.get(i);
			
			System.out.printf("%13s %13s %10s %30s %17s\n",
					dto.getBno(),dto.getSno(),dto.getBtitle(),dto.getBday(),dto.getBview());
			System.out.println("------------------------------------------------------------------------------------------");
			
		}
	}
	public void boardView() {
		System.out.println("----- POST VIEW -------");
		// 1. 보고자하는 게시물의 게시물번호를 입력받기[식별번호]
		System.out.println("게시물번호: "); int bno = sc.nextInt();
		
		BoardDto result = BoardController.getInstance().boardView(bno);
		
		System.out.printf("bno : %-3s view : %-3s day : %-19s \n" , 	result.getBno() , result.getBview() , result.getBday() );
		
		System.out.printf("title : %s \n",result.getBtitle());
		System.out.printf("content : %s \n ",result.getBcontent());
		System.out.println("--------------------------------------");
		
	}
	public void boardDelete() {
		System.out.println("게시물번호: "); int bno = sc.nextInt();
	}
}
