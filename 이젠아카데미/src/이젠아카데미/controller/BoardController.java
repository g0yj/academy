package 이젠아카데미.controller;

import java.util.ArrayList;

import 이젠아카데미.model.dao.BoardDao;
import 이젠아카데미.model.dto.BoardDto;

public class BoardController {
	// 1. 싱글톤 객체 생성
	private static BoardController boardController = new BoardController();
	public static BoardController getInstance() {return boardController;}
	private BoardController () {}
	
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
}
