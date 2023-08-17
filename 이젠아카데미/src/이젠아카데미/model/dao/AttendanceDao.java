package 이젠아카데미.model.dao;

import java.time.LocalDate;

import 이젠아카데미.controller.AttendanceController;

public class AttendanceDao extends Dao{
	private static AttendanceDao attendanceDao = new AttendanceDao();
	public static AttendanceDao getInstance() {return attendanceDao;}
	private AttendanceDao () {}
	
	public boolean 출석하기(int loginSession) {
		if( 오늘출석여부확인(  loginSession ) ) return false;
		// 만약에 오늘날짜 이면서 회원번호 가 일치하면 이미 출석 완료된 상태 
		String sql = "insert into attendance (sno) values(?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, loginSession);
			ps.executeUpdate();
			return true;
		}catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
	
	public boolean 오늘출석여부확인( int loginSession ) {
		try {
			String sql = "select * from attendance where sno = ? and date_format(aday , '%Y-%m-%d') = curdate()";
			ps = conn.prepareStatement(sql);
			ps.setInt( 1 , loginSession);
			rs = ps.executeQuery();
			if( rs.next() ) {
				return true;
			}
		}catch (Exception e) {System.out.println(e);}
		return false;
	}
}



/*
 
	 select * from attendance where sno = 1 and date_format(aday , '%Y-%m-%d') = curdate();
	
	select * from attendance where sno = ? and date_format(aday , '%Y-%m-%d') = curdate();
	
	select count(*) from attendance where sno = 1; -- 출석횟수 
	select ltotalday from student s natural join lesson l where s.sno = 1 ;
 
  
 */

















