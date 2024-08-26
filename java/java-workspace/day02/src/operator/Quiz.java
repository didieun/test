package operator;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		
		// 수를 입력 받아 짝, 홀 구분
		// 10 입력시 "10 짝수 입니다"
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("수 입력: ");
		int num = input.nextInt();
		 
		String msg = (num % 2 == 0) ? num + " 는 짝수 입니다." : num + "는 홀수 입니다.";
		System.out.println(msg);
		
		System.out.println();
		
		// 3의 배수 구분
		System.out.print("수 입력: ");
		num = input.nextInt();
		
		msg = (num % 3 == 0) ? num + "는 3의 배수입니다." : num + "는 3의 배수가 아닙니다.";
		System.out.println(msg);
		
		System.out.println();
		
		// 두 수를 입력 받아 큰 수 출력
		int num1, num2, num3;
		System.out.print("첫번째 수 입력: ");
		num1 = input.nextInt();
		System.out.print("두번째 수 입력: ");
		num2 = input.nextInt();
		
//		msg = (num1 > num2) ? num1 + "이(가) 더 큽니다." : num2 + "이(가) 더 큽니다.";
		num3 =  (num1 > num2) ? num1 : num2;
		System.out.println(num3);
		
		System.out.println();
		
		// 수를 입력 받아 5의 배수이면서 짝수인지 확인
		// "5의 배수이며 짝수" 또는 "아님"
		System.out.print("수 입력: ");
		num = input.nextInt();
		
		msg = (num % 5 == 0 && num % 2 == 0) ? num + "는 5의 배수이며 짝수입니다." : "아님";
		System.out.println(msg);
		
		input.close();

	}

}
