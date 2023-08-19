package 이젠아카데미.model.dao;

import 이젠아카데미.model.dto.BoardDto;
import 이젠아카데미.model.dto.ReviewBoardDto;

public class ReviewBoardDao extends Dao{

	private static ReviewBoardDao ReviewBoardDao= new ReviewBoardDao();
	public static ReviewBoardDao getInstance() { return ReviewBoardDao; }
	private ReviewBoardDao() {}	
	
	
// 1. 글쓰기-----------------------------------------------------------------

	public boolean reviewWrite(ReviewBoardDto reviewBoardDto) {
		
		try {
			String sql = "insert into reviewboard(rtitle, rcontent, rgrade) values(?,?,?)";
		
			ps = conn.prepareStatement(sql);
			ps.setString(1, reviewBoardDto.getRtitle());
			ps.setString(2, reviewBoardDto.getRcontent());
			ps.setInt(3, reviewBoardDto.getRgrade());
			
			int row = ps.executeUpdate();
			if(row==1) return true;
		}catch(Exception e) {System.out.println(e);}
		return false;
		
		/*public boolean boardWrite(BoardDto boardDto) {
		      try {
		         String sql = "insert into board(btitle,bcontent,sno) values(?,?,?)";
		         
		         ps = conn.prepareStatement(sql);
		         ps.setString(1,boardDto.getBtitle());
		         ps.setString(2,boardDto.getBcontent());
		         ps.setInt(3, boardDto.getSno());

		         int row = ps.executeUpdate();
		         if(row==1) return true;
		         
		         
		      }catch (Exception e) {System.out.println(e);}
		      return false;
		   }	
		*/
			
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
		
	
}
