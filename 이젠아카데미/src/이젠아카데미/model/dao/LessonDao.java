package 이젠아카데미.model.dao;

import 이젠아카데미.model.dto.LessonDto;

public class LessonDao extends Dao{
	//0.싱글톤
	private static LessonDao LessonDao = new LessonDao();
	public static LessonDao getInstance() { return LessonDao; }
	private LessonDao() {}
				
				
	public boolean lessonWriteView(LessonDto lessonDto) {
	
		try {
			String sql = "insert into lesson(lname,ltname,ltotalday,lopenday) values(?,?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1, lessonDto.getLname());
			ps.setString(2, lessonDto.getLtname());
			ps.setString(3, lessonDto.getLtotalday());
			ps.setString(4, lessonDto.getLopenday());
			
			int row = ps.executeUpdate();
			if(row ==1) return true; 
					
			
		}catch (Exception e) {System.out.println("dao오류: "+e);}
		return false;
	}
	
	
	
}
