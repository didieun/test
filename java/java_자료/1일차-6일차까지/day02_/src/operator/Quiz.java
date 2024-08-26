package operator;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		//수를 입력 받아 짝, 홀 구분
		// 10 입력시 "10은 짝수 입니다"
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = sc.nextInt();
		String result;
		result = ( num % 2 == 0)
				?num+"는 짝수"
				:num+"는 홀수";
		System.out.println( result );
		// 3의 배수 구분
		System.out.println("수 입력");
		num = sc.nextInt();
		//String result;
		result = ( num % 3 == 0)
				?num+"는 3의 배수"
				:num+"는 배수 아님!!!";
		System.out.println( result );
		// 두 수를 입력 받아 큰 수 출력
		int n1, n2, n3;
		System.out.println("두 수 입력");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = (n1 > n2)?n1:n2;
		System.out.println( "n1 : "+n1 );
		System.out.println( "n2 : "+n2 );
		System.out.println( "n3 : "+n3 );
		// 수를 입력 받아 5의 배수이면서 짝수인지 확인
		// "5의 배수이며 짝수" 또는 "아님"
		
		System.out.println("수 입력");
		n1 = sc.nextInt();
		result = ( n1%5 == 0 && n1 % 2 == 0)
		?"5의 배수이며 짝수"
		:"아님";
		System.out.println( result );
	}
}







