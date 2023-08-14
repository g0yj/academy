package 이젠아카데미.model.dao;

import java.util.ArrayList;

import 이젠아카데미.model.dto.BoardDto;





public class BoardDao extends Dao{
	private static BoardDao boardDao = new BoardDao();
	public static BoardDao getInstance() {return boardDao;}
	private BoardDao() {}
	public ArrayList<BoardDto> boardPrint() {
		 ArrayList<BoardDto> list = new ArrayList<>();
		 try {
			 String sql = "select b.*,s.sno from student s natural join board b   order by b.bday desc;";
			 ps = conn.prepareStatement(sql);
			 rs=ps.executeQuery();
			 
			 while(rs.next()) {
				 BoardDto dto = new BoardDto(
						 rs.getInt(1),rs.getInt(2),rs.getString(3),
						 rs.getString(4),rs.getString(5),rs.getInt(6));
						 list.add(dto);
			 }
			 
		 }catch (Exception e) {System.out.println(e);}
		 return list;
	}
	public BoardDto boardView(int bno) {
		try {
			String sql ="select b.*,s.sno from board b natural join student s where b.bno=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, bno);
			rs=ps.executeQuery();
			if(rs.next()) {
				BoardDto dto = new BoardDto(
						rs.getInt(1),rs.getInt(2),rs.getString(3),
						 rs.getString(4),rs.getString(5),rs.getInt(6));
				boardViewCount(dto.getBno());
				return dto;
			}

		}catch (Exception e) {System.out.println(e);}
		return null;
	}
	  // 11-2. 조회수 증가 함수
    public boolean boardViewCount(int bno) {
       try {
	          String sql = "update board set bview =bview + 1 where bno = ?";
	          ps = conn.prepareStatement(sql);
	          ps.setInt(1, bno);
	          ps.executeUpdate();
       		}catch (Exception e) {System.out.println(e);}
       
       
       return false;
       
    }
	// 게시글 번호 받아서 삭제
	public boolean boardDelete(int bno) {
		try {
			String sql = "delete from board where bno = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, bno);
			int row = ps.executeUpdate();
			if(row == 1) return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return false;
	}
}
