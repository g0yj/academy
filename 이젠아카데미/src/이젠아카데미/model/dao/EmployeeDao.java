package 이젠아카데미.model.dao;

import java.util.ArrayList;

import 이젠아카데미.controller.EmployeeController;
import 이젠아카데미.model.dto.EmployeeDto;
import 이젠아카데미.model.dto.LessonDto;

public class EmployeeDao extends Dao{

// 0. 싱글톤
	private static EmployeeDao EmployeeDao = new EmployeeDao();
	public static EmployeeDao getInstance() { return EmployeeDao; }
	private EmployeeDao() {}
	
//1. 직원등록------------------------------------------------------------------			

	public boolean employeewriteView(EmployeeDto employeeDto) {
		
		try {
			String sql = "insert into lesson(eno, era, ename, epay) values(?,?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, employeeDto.getEno());
			ps.setString(2, employeeDto.getEra());
			ps.setString(3, employeeDto.getEname());
			ps.setString(4, employeeDto.getEpay());
			int row = ps.executeUpdate();
			if(row==1) return true;
		}catch(Exception e) {System.out.println("dao오류: "+e);}
		return false;
		}

//2. 직원전체조회------------------------------------------------------------------
	
		public ArrayList<EmployeeDto> employeeprintView() {
			ArrayList<EmployeeDto> list = new ArrayList<>();
			
			try {
				String sql = "select * from employee";
				ps = conn.prepareStatement(sql);
				rs = ps.executeQuery();
				
				
				while(rs.next()) {
					EmployeeDto dto = new EmployeeDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
					
						list.add(dto);
				}// while e
			}catch(Exception e) {
				System.out.println("Dao 직원관리 실패 사유"+e);
				
			}
			return list;
			
			
		}

//3. 직원수정------------------------------------------------------------------		
		
		public boolean employeeupdateView(EmployeeDto dto) {
			
		
			try {
				String sql = "insert into lesson(eno, era, ename, epay) values(?,?,?,?)";
				ps=conn.prepareStatement(sql);
				ps.setInt(1, dto.getEno());
				ps.setString(2, dto.getEra());
				ps.setString(3, dto.getEname());
				ps.setString(4, dto.getEpay());
				ps.executeUpdate();
				return true;
			}catch(Exception e) {System.out.println("employeeupdateView()Dao오류: "+e);}
			
			return false;
			}
		
//4. 직원삭제------------------------------------------------------------------

		public boolean employeedeleteView(int eno) {
	
			try {
			
				String sql = "delete from employee where lno = ?";
				ps = conn.prepareStatement(sql);
				ps.setInt(1, eno);
				
				int row = ps.executeUpdate();
				if(row == 1) return true;
			}catch(Exception e) {System.out.println("employeedeleteView()DAO오류: "+e);	
			}
			return false;
			}
		
		
	
		
	
}// class e
