package 이젠아카데미.controller;

import java.util.ArrayList;

import 이젠아카데미.model.dao.BoardDao;
import 이젠아카데미.model.dto.BoardDto;

public class BoardController {
	private static BoardController boardController = new BoardController();
	public static BoardController getInstance() {return boardController;}
	private BoardController () {}
	
	public ArrayList<BoardDto> boardPrint(){
		return BoardDao.getInstance().boardPrint();
	}
	public BoardDto boardView(int bno) {
		return BoardDao.getInstance().boardView(bno);
	}
}
