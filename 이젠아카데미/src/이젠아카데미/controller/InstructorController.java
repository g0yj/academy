package 이젠아카데미.controller;

import 이젠아카데미.view.InstructorView;

public class InstructorController {

	private static InstructorController instructor = new InstructorController();
	public static InstructorController getInstance() {return instructor;}
	private InstructorController() {}
	
	
}
