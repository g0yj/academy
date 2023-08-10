package 이젠아카데미.model.dao;

import java.util.ArrayList;

import 이젠아카데미.model.dto.StudentDto;

public class StudentDao extends Dao {
	
	private static StudentDao d = new StudentDao();
	public static StudentDao getInstance() {return d;}
	private StudentDao() {}
	
//1. 학생등록(고연진)----------------------------------------
	public boolean studentJoin(StudentDto dto) {
		String sql = "insert into student(sno,sname,saddress,sphone,lno)values(?,?,?,?,?)";
		
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1,dto.getSno());
			ps.setString(2,dto.getSname());
			ps.setString(3,dto.getSaddress());
			ps.setString(4,dto.getSphone());
			ps.setInt(5,dto.getLno());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println("Dao 학생등록 실패이유: "+e) ;}
		return false;
	}//studentJoin()

// 2. 학생정보조회(이진형)------------------------------------------------------------
	public ArrayList<StudentDto> studentAllSelect() {
		ArrayList<StudentDto> list = new ArrayList<>();
		try {
			String sql = "select * from student"; 
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			
			while(rs.next()) {
				 StudentDto dto = new StudentDto(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4),
						   rs.getInt(5));
				   
				   list.add(dto);
			}

		}catch(Exception e) {
			System.out.println("Dao 학생관리 실패 사유"+e);
			}
		return list;
	}

//3. 학생정보수정(고연진)------------------------------------------------------------------	
	public StudentDto studentUpdate(int mno) {
		try {
			String sql = "update student set sname="sname" ";
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


