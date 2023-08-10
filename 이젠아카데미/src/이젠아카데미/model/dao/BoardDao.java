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
				return dto;
			}

		}catch (Exception e) {System.out.println(e);}
		return null;
	}
}
