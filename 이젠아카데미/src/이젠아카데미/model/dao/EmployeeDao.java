package 이젠아카데미.model.dao;

import 이젠아카데미.controller.EmployeeController;

public class EmployeeDao {

	// 0. 싱글톤
	private static EmployeeDao EmployeeDao = new EmployeeDao();
	public static EmployeeDao getInstance() { return EmployeeDao; }
	private EmployeeDao() {}
	
	
	
	
}// class e
