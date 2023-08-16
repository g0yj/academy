package 이젠아카데미.model.dao;

public class InstructorDao extends Dao {

	private static InstructorDao instructor = new InstructorDao();
	public static InstructorDao getInstance() {return instructor;}
	private InstructorDao() {}
	
	
// 1. 강사vs행정을 구분하는 함수----------------------------	
		public boolean instructorMain(int jno)
		{
		try {
			String sql = "select ? from employee natural join signup  where era like'강사%'";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, jno);
			rs= ps.executeQuery();
			if(rs.next()) {
				//InstructorDto dto = new InstructorDto(rs.getString(1), rs.getInt(2));
				return true;
			}
		}catch (Exception e) {System.out.println("dao오류: "+e);}
		 	return false;
		
		}//f()	
	
	
	
}//c
