package 이젠아카데미.view;

import java.util.ArrayList;
import java.util.Scanner;

import 이젠아카데미.controller.BoardController;
import 이젠아카데미.controller.MessageController;
import 이젠아카데미.controller.SignupController;
import 이젠아카데미.model.dto.MessageDto;

public class MessageView {

	private static MessageView M = new MessageView();
	public static MessageView getInstance() {return M;}
	private MessageView() {}
	
	private Scanner sc = new Scanner(System.in);

//메세지보내기(고연진)------------------------------------------------------	
	public void messageSend() {
		
		int eno = SignupController.getInstance().getLoginSession();
		
		// 코드번호로 메세지 전송. 
		System.out.println("받는사람: "); int sno = sc.nextInt();
		sc.nextLine();
		//학생코드와 이름을 매칭시켜서 전달해야될듯
		System.out.println("메세지내용: "); String mcontent = sc.nextLine();
		
		MessageController.getInstance().messageSend(eno,mcontent,sno);
		
		System.out.println("-------------보낸쪽지함---------------");
		messageView();
	}//f()
	
//직원=> 본인 학생이 받은 목록(쪽지전체보기)(고연진)----------------------------------------------------------
	public void messageView() {
		int eno = SignupController.getInstance().getLoginSession();
		System.out.printf("%-5s %-10s\n","받는사람","메세지내용");

		ArrayList<MessageDto> result= MessageController.getInstance().messageView(eno);
		for(int i=0;i<result.size();i++) {
			 MessageDto dto = result.get(i);
			 System.out.printf("%-5s %-15s\n", dto.getSname(),dto.getMcontent());
		}
	
	}

// 직원이 보낸 메시지 확인-----------------------------------------------
	
	
//학생=> 본인 학생이 받은 목록(고연진)------------------------------------
	public void messageCheck() {
		int sno = BoardController.getInstance().getLoginSession();
		System.out.printf("%-5s %-10s\n","보낸사람","메세지내용");
		
		ArrayList<MessageDto> result=
				MessageController.getInstance().messageCheck(sno);
		for(int i=0; i<result.size();i++) {
			MessageDto dto= result.get(i);
			System.out.printf("%-5s %-15s\n", dto.getEname(),dto.getMcontent());
			
		}
		
	}//f()
	
}//c
