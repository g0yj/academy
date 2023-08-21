package 이젠아카데미.model.dao;

import java.util.ArrayList;

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
		}catch(Exception e) {System.out.println("Dao 글쓰기 실패사유: "+e);}
		return false;

	}

		
// 2. 글 전체조회-----------------------------------------------------------------	

	public ArrayList<ReviewBoardDto> reviewTotalView() {
		
		ArrayList<ReviewBoardDto> list = new ArrayList<>();
		try {
			String sql = "select rno,sno,rtitle,rgrade from reviewboard";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				ReviewBoardDto dto = new ReviewBoardDto(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4));
				list.add(dto);
				
			}
		
		}catch(Exception e) {System.out.println("Dao 글 전체조회 실패사유: "+e);}
		return list;

			
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
