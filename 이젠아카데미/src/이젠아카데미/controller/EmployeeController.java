package 이젠아카데미.controller;

import 이젠아카데미.view.EmployeeView;

public class EmployeeController {

	// 0. 싱글톤
	private static EmployeeController EmployeeController = new EmployeeController();
	public static EmployeeController getInstance() { return EmployeeController; }
	private EmployeeController() {}

	
	
}//class e
