package 이젠아카데미.model.dao;

import 이젠아카데미.model.dto.LessonDto;

public class LessonDao extends Dao{
	//0.싱글톤
	private static LessonDao LessonDao = new LessonDao();
	public static LessonDao getInstance() { return LessonDao; }
	private LessonDao() {}
	
	public LessonDto lessonWriteView(LessonDto lessonDto) {
		String sql = "insert  into student (sname,saddress,sphone,lno) values( ?,?,?,?)";
		try {
			ps=conn.prepareStatement(sql);
			ps.
					
			
		}catch (Exception e) {System.out.println("dao오류: "+e);
		}
		return result;
	}
	
	
	
}
