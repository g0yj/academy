package 이젠아카데미.controller;

import java.util.ArrayList;

import 이젠아카데미.model.dao.BoardDao;
import 이젠아카데미.model.dao.LessonDao;
import 이젠아카데미.model.dao.ReviewBoardDao;
import 이젠아카데미.model.dto.BoardDto;
import 이젠아카데미.model.dto.LessonDto;
import 이젠아카데미.model.dto.ReviewBoardDto;

public class ReviewBoardController {

	private static ReviewBoardController ReviewBoardController= new ReviewBoardController();
	public static ReviewBoardController getInstance() { return ReviewBoardController; }
	private ReviewBoardController() {}
	//private int loginSession = 0; // 0: 로그인 안한상태 1이상 : 로그인된 회원의 번호
	//public int getLoginSession() {return loginSession;} 
	
	
// 1. 글쓰기-----------------------------------------------------------------

	public boolean reviewWrite(String rtitle, String rcontent, int rgrade) {
			
		// 1. 제목이 0글자이거나 50글자 이상이면 글 쓰기 실패
		if(rtitle.length()==0|| rtitle.length()>50) {return false;}
		
		ReviewBoardDto reviewBoardDto = new ReviewBoardDto(rtitle, rcontent, rgrade); //loginSession 넣어야할지 말아야할지
		return ReviewBoardDao.getInstance().reviewWrite(reviewBoardDto);

			
	}

		
// 2. 글 전체조회-----------------------------------------------------------------	

	public ArrayList<ReviewBoardDto> reviewTotalView() {
		
		return ReviewBoardDao.getInstance().reviewTotalView();
			
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
		
}
