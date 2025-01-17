package common;
//휴대폰
//1. 전원 
//  - 배터리
//2. 전화
// - 전화 받고 끊고
// - 수신차단
// - 연락처 등록
//3. 문자
//4. 노래
// - 수신, 발신
//5. 사진
//6. 은행

import java.util.Scanner;

import call.Call_Operate;
import cellphone.Message_Operate;
import music.Music;
import onoff.OnOff_Operate;
import park.Photo;
import bank.BankApp;

public class MainClass {

   public static void main(String[] args) {
	   OnOff_Operate onoff = new OnOff_Operate();
	   Call_Operate call = new Call_Operate();
	   Message_Operate ms = new Message_Operate();
	   Music music = new Music();
	   Photo photo = new Photo();
	   BankApp bank = new BankApp();
	   
	   Scanner input = new Scanner(System.in);
	   int num;
	   while(true) {
		   System.out.println("메뉴를 선택하세요");
		   System.out.println("1. 전원");
		   System.out.println("2. 전화");
		   System.out.println("3. 문자");
		   System.out.println("4. 노래");
		   System.out.println("5. 사진");
		   System.out.println("6. 은행");
		   System.out.print(">>> ");
		   num = input.nextInt();
		   switch(num) {
			   	case 1:
			   		onoff.OnOff();
			   		break;
			   	case 2:
			   		call.display();
			   		break;
			   	case 3:
			   		ms.display();
			   		break;
			   	case 4:
			   		music.display();
			   		break;
			   	case 5:
			   		photo.display();
			   		break;
			   	case 6:
			   		bank.run(input);
			   		break;
         }
      }

   }

}
