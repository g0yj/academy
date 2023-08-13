package 이젠아카데미.model.dao;

import 이젠아카데미.model.dto.SignupDto;

public class SignupDao extends Dao {

	private static SignupDao sign = new SignupDao();
	public static SignupDao getInstance() {return sign;}
	private SignupDao() {}
	
	
	
// 1.회원가입-----------------------------------------------
	public boolean signup(SignupDto dto) {
		try {
			String sql="insert into signup(jname,jid,jpw) values (?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1, dto.getJname());
			ps.setString(2, dto.getJid());
			ps.setString(3, dto.getJpw());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println("dao실패이유: "+e);}
		return false;
	}//f()	
	
	
}//c
