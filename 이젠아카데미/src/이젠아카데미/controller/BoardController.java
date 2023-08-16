package 이젠아카데미.controller;

import java.util.ArrayList;


import 이젠아카데미.model.dao.BoardDao;
import 이젠아카데미.model.dto.BoardDto;

public class BoardController {
	// 1. 싱글톤 객체 생성
	private static BoardController boardController = new BoardController();
	public static BoardController getInstance() {return boardController;}
	private BoardController () {}
	private int loginSession = 0; // 0: 로그인 안한상태 1이상 : 로그인된 회원의 번호
	public int getLoginSession() {return loginSession;} 
	
	// 2. 게시글 전체보기
	public ArrayList<BoardDto> boardPrint(){
		return BoardDao.getInstance().boardPrint();
	}
	// 3. 게시글 상세 보기
	public BoardDto boardView(int bno) {
		return BoardDao.getInstance().boardView(bno);
	}
	
	// 4. 게시글 번호 받아서 삭제
	public boolean boardDelete(int bno) {
		
		boolean result = BoardDao.getInstance().boardDelete(bno);
		return result;
	}
	
	public void attendanceView() {}
	public boolean information(String name,String phone) {
		
		int result= BoardDao.getInstance().information(name,phone);
		// 로그인 성공했을때 기록 하기 [ -로그인 이후 로그인된정보로 활동 ]
		if(result>=1) {this.loginSession=result;  return true;}
		else{return false;}	
	}
	
	public boolean boardWrite(String title , String content) {
		
		// 1. 유효성 검사
		if(title.length()==0 || title.length()>50) {return false;}
		
		// 2. Dto[ 입력받은제목 , 입력받은내용 , 로그인된회원번호]
		BoardDto boardDto = new BoardDto(loginSession , title,content  );	
		
		return BoardDao.getInstance().boardWrite(boardDto);
	}
	// 내글보기
	public ArrayList<BoardDto> myWriting() {
		
		return BoardDao.getInstance().myWriting(loginSession);
		
	}
	public void boardUpdate() {
		
	}
}
