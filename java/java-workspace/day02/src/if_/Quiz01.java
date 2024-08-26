package if_;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*
		  1. 두 수 입력 큰 수 출력 
		  2. 세 수 입력 가장 큰 수 출력
		  3. 두 수 입력 합이 짝수이고 3의 배수 출력
		 */
		
		int num1, num2, num3;
		System.out.println("두 수 입력: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1 + "수가 더 크다");
		}
		
		if(num1 < num2) {
			System.out.println(num2 + "수가 더 크다");
		}
		
		System.out.println("세 수 입력: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		
		// 선생님 풀이
//		int max = 0;;
//		if(num1 > num2 ) {
//			max = num1;
//		}
//		if(num2 > num1 ) {
//			max = num2;
//		}
//		if(num3 > max ) {
//			max = num3;
//		}
//		
//		System.out.println(max);
	
		
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1 + "수가 가장 크다");
		}
		
		if(num1 < num2 && num3 < num2) {
			System.out.println(num2 + "수가 가장 크다");
		}
		
		if(num1 < num3 && num2 < num3) {
			System.out.println(num3 + "수가 가장 크다");
		}
		
		System.out.println("두 수 입력: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
//		// 선생님 풀이
//		int sum = num1 + num2;
//		if(sum % 2 == 0 && sum % 3 == 0) {
//			System.out.println("두 수 합이 짝수이면서 3의 배수 이다.");
//		}
//		// 또는
//		if(sum % 6 == 0 ) {
//			System.out.println("두 수 합이 짝수이면서 3의 배수 이다.");
//		}
		
		if((num1 + num2) % 2 == 0 &&  (num1 + num2) % 3 == 0) {
			System.out.println("두 수 합이 짝수이면서 3의 배수 이다.");
		}
		
		if((num1 + num2) % 2 == 0 ||  (num1 + num2) % 3 == 0) {
			System.out.println("아님");
		}
	
		input.close();

	}

}
