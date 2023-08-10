package 이젠아카데미.model.dao;

import java.util.ArrayList;

import 이젠아카데미.model.dto.StudentDto;

public class StudentDao extends Dao {
	
	private static StudentDao d = new StudentDao();
	public static StudentDao getInstance() {return d;}
	private StudentDao() {}
	
//1. 학생등록(고연진)----------------------------------------
	public boolean studentJoin(StudentDto dto) {
		String sql = "insert into student(sname,saddress,sphone,lno)values(?,?,?,?)";
		
		try {
			ps=conn.prepareCall(sql);
			ps.setString(1,dto.getSname());
			ps.setString(2,dto.getSaddress());
			ps.setString(3,dto.getSphone());
			ps.setInt(4,dto.getLno());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println("Dao 학생등록 실패이유: "+e) ;}
		return false;
	}//studentJoin()

// 2. 학생정보조회(이진형)------------------------------------------------------------
	public StudentDto[] studentAllSelect() {
		try {
			String sql = "select * from ezenacademy";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			rs.last();
			int row = rs.getRow();
			rs.first();
			StudentDto[] dtoList = new StudentDto[row]; int i = 0;
			while(rs.next()) {
				
			}

		}catch(Exception e) {
			System.out.println(e);
			}
		return null;
	}

//3. 학생정보수정(고연진)------------------------------------------------------------------	
	public StudentDto studentUpdate(int mno) {
		try {
			String sql = ""
		}catch (Exception e) {System.out.println("studentUpdate()DAO 오류: "+e);
		}
		return null;
		}//f()
	
	
//4. 학생삭제(이진형)---------------------------------------------------------------------
	public boolean studentDelete(int sno) {
		try {
			String sql = "delete from ezenacademy where sno = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1,sno);
			ps.executeUpdate();
			int row = ps.executeUpdate(); // 삭제한 레코드 반환 (mno은 pk라서 2개 이상 나오면 이상한거)
			if(row == 1) return true;
		   }catch (Exception e) {
			   System.out.println(e);
		   }
		return false;
		}
	
	}


