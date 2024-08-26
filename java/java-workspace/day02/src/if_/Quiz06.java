package if_;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		// 비행기를 타는데 30분 거리까지의 기본 요금은 30000원이며, 10분 단위로 추가 요금 5000원씩 부가된다. 비행기 탈 시간을 입력하여 요금 계산기를 만드시오.
		
		Scanner input = new Scanner(System.in);
		System.out.print("비행시간 입력: ");
		int time = input.nextInt();
		
		int money = 0;
		int minute;
		
		if(time <= 30) {
			money = 30000;
			System.out.println("비행 요금은 " + money + "원 입니다.");
		} else {
			minute = (time - 30) / 10; 
			
			if((time - 30) % 10 != 0 || (time - 30) % 10 > 10) {
				money = 30000 + (minute * 5000) + 5000;
				System.out.println("비행 요금은 " + money + "원 입니다.");
				
			} else {
				money = 30000 + (minute * 5000);
				System.out.println("비행 요금은 " + money + "원 입니다.");
			}
			
		}
		
		// 강사님 풀이
//		int time;
//		money=30000;
//		System.out.print("비행기 탄 시간(분): ");
//		time = input.nextInt();
//		time-=30;
//		if(time>0){
//			//money += (5000+((time-1)/10)*5000);
//			if(time%10 == 0)
//				money=money+time/10*5000;
//			else
//				money=money+time/10*5000+5000;
//		}
//		System.out.println(time+"분 비행기 요금 : "+money+"원 입니다");
		
		input.close();

	}

}
