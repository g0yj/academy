package 키오스크.Controller;

import 키오스크.model.Dao;
import 키오스크.model.Dto;

public class Controller {
	
	private static Controller controller = new Controller();
	
	public static Controller getInstance() {return controller;}
	
	private Controller() {}

//-----------------------------------------------------------------
	public String inputNumLogic( int no ) {
		
		return Dao.drinkList[no].getName() + " 의 제품 "+Dao.drinkList[no].getPrice()+" 원 입니다.";
		
	}
	
}
