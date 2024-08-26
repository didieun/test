package if_;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// usb 1개에 5000원한다. 그런데 한번에 10개이상을 사면 전체 금액의 10%를 할인하여 준다
		// 그리고 100개 이상을 사면 전체 금액의 12%를 할인하여 준다.X개의 usb을 사려면 얼마가 있어야 하는가?
		
		Scanner input = new Scanner(System.in);
		System.out.print("usb 갯수: ");
		int num = input.nextInt();
		int money = 0;
		double discount = 0;
		
		if(num >= 100) {
			
			discount = 0.88;
			money = (int)((num * 5000) * discount);
			System.out.println("USB " + num + "개의 금액은 " + money + "원 이다.");
			
		} else if(num >= 10) {
			
			discount = 0.9;
			money = (int)((num * 5000) * discount);
			System.out.println("USB " + num + "개의 금액은 " + money + "원 이다.");
			
		} else {
			money = num * 5000;
			System.out.println("USB " + num + "개의 금액은 " + money + "원 이다.");
		}
		
		// 강사님 풀이
//		Scanner input = new Scanner(System.in);
//		int usb,money=0;
//
//		System.out.print("usb 구입 개수 입력 : ");
//		usb = input.nextInt();
//		if(usb > 0) {
//			if(usb<10) 
//				money = usb*5000;
//			else if(usb >=10 && usb <100 )
//				money = (usb*5000) - (usb*5000)/10;
//			else
//				money = (usb*5000) - (usb*5000)*12/100;
//		}
//		System.out.println("usb 총 가격 : "+money);
//		
		
		input.close();

	}

}
