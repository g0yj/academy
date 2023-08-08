package 이젠아카데미.model.dao;

import 이젠아카데미.model.dto.StudentDto;

public class StudentDao extends Dao {
	
	private static StudentDao d = new StudentDao();
	public static StudentDao getInstance() {return d;}
	private StudentDao() {}
	
	// 학생등록----------------------------------------
	public boolean studentJoin(StudentDto dto) {
		String sql = "insert into student(sname,sage,saddress)values(?,?,?)";
		
		try {
			ps=conn.prepareCall(sql);
			ps.setString(1,dto.getSname());
			ps.setInt(2,dto.getSage());
			ps.setString(3,dto.getSaddress());
			
			ps.executeUpdate();
			
			return true;
		} catch (Exception e) {System.out.println("Dao 학생등록 실패이유: "+e) ;}
		
		
		return false;

	}//studentJoin()

}
