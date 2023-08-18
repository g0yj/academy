package 이젠아카데미.model.dao;

import java.util.ArrayList;

import 이젠아카데미.model.dto.MessageDto;

public class MessageDao extends Dao{

	private static MessageDao M = new MessageDao();
	public static MessageDao getInstance() {return M;}
	private MessageDao() {}
	
	
//메세지보내기(고연진)------------------------------------------------------	
	public boolean messageSend(MessageDto dto) {
		
		try {
			String sql = "insert into Message(eno,mcontent,sno)values(?,?,?) ";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, dto.getEno());
			ps.setString(2, dto.getMcontent());
			ps.setInt(3, dto.getSno());
			ps.executeUpdate();
			return true;
		}catch (Exception e) {System.out.println("dao오류:"+e);}
		 	return false;
		}//f()	
//보낸쪽지함(고연진)----------------------------------------------------------
	public ArrayList<MessageDto> messageView(int eno) {
		
			ArrayList<MessageDto>list=new ArrayList<>();
		
			try {
				String sql = "select sno,sname,mcontent from student natural join message where eno=?";
				ps=conn.prepareStatement(sql);
				ps.setInt(1, eno);
				rs = ps.executeQuery();
				while(rs.next()) {
					MessageDto dto = new MessageDto(rs.getString(2), rs.getString(3)) ;   
					list.add(dto);
				}//w
			
			}//t
			catch (Exception e) {System.out.println("dao오류: "+e);
			}//cat
		return list;
	}	
	
	
	
	
}//c
