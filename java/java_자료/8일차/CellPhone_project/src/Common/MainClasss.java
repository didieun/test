package Common;
import java.util.Scanner;
import HK_project.OnOff_Operate;//현경님
import HJ_project.BankApp_Operate;//혁주님
import CR_project.Message_Operate; //채림님
import JE_project.Photo_Operate;//지은님
import JH_project.Call_Operate;//지훈님
import MK_project.Music_Operate;

public class MainClasss {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		MainDTO dto = new MainDTO();//배터리 관련
		dto.setBattery(100);//초기 배터리 100%
		
		OnOff_Operate onoff = new OnOff_Operate();//전원
		//전원 
		Call_Operate call = new Call_Operate();//전화
		Message_Operate message = new Message_Operate();//문자
		Music_Operate music = new Music_Operate();//노래
		Photo_Operate photo = new Photo_Operate();//사진
		BankApp_Operate bank = new BankApp_Operate();//은행
		boolean run = true; 
		//배터리 0% 시 while문 종료 시키기 위함
		while(run) {
			run = dto.CheckBattery(); 
			//배터리를 확인 후 True(while 계속),False(while 종료) 넣기
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 전원");//0%
			System.out.println("2. 전화");//-10%
			System.out.println("3. 문자");//-20%
			System.out.println("4. 노래");//-30%
			System.out.println("5. 사진");//-20%
			System.out.println("6. 은행");//-20%
			System.out.print(">>> ");
			num = input.nextInt();
			switch(num) {
			case 1: //전원
				onoff.OnOff();
				break;
			case 2:// 전화
				dto.UseBattery(10);
				call.display();
				break;
			
			case 3://문자
				dto.UseBattery(20);
				message.display();
				break;
			case 4://노래
				dto.UseBattery(30);
				music.display();
				break;
			case 5:// 사진
				dto.UseBattery(20);
				photo.display();
				break;
			case 6://은행
				dto.UseBattery(20);
				bank.run(input);
				break;
			}
		}

	}

}
