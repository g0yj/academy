package 이젠아카데미.controller;

import 이젠아카데미.model.dao.IncentivesDao;

public class IncentivesController {

	private static IncentivesController incentivesController = new IncentivesController();
	public static IncentivesController getInstance() { return incentivesController; }
	private IncentivesController() {}

	
	public void 훈련장려금목록() {
		
	 IncentivesDao.getInstance().훈련장려금목록();
	
	}
	
	public void 훈련장려금지급() {
		
		IncentivesDao.getInstance().훈련장려금지급();
		
	}
}
