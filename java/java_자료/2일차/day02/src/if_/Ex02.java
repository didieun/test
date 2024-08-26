package if_;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		if( num > 10 )
		{
			System.out.println("1. 10보다 크다");
			System.out.println("2. 10보다 크다");
			System.out.println("3. 10보다 크다");
		}
		System.out.println("다음 문장들 실행");
		System.out.println("다음 문장들 실행");
		
		if( num % 2 != 0 ) { // num % 2 == 1
			System.out.println("입력 값은 홀수");
		}
		if( num % 2 == 0 ) {
			System.out.println("짝수....");
		}
		

	}
}


















