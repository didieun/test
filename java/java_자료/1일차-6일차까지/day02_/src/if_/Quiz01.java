package if_;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/*
	 	1. 두 수 입력 큰 수 출력
	 	2. 세 수 입력 가장 큰 수 출력
	 	3. 두 수 입력 받고 두 수의 합이 짝수이고 3의 배수 출력
		*/
		Scanner input = new Scanner(System.in);
		int n1, n2, n3;
		/*
		System.out.println("두 수 입력");
		n1 = input.nextInt();
		n2 = input.nextInt();
		if( n1 > n2 ) {
			System.out.println(n1 + "큰 수");	
		}
		if( n2 > n1 ) {
			System.out.println(n2 + "큰 수");	
		}
		*/
		/*
		System.out.println("세 수 입력");
		n1 = input.nextInt();
		n2 = input.nextInt();
		n3 = input.nextInt();
		int max = 0;
		if(n1 > n2) {
			max = n1;
		}
		if(n2 > n1) {
			max = n2;
		}
		if( n3 > max ) {
			max = n3;
		}
		System.out.println( max );
		*/
		/*
		if( n1 > n2 && n1 > n3 ) {
			System.out.println("n1이 가장 크다");
		}
		if( n2 > n1 && n2 > n3 ) {
			System.out.println("n2이 가장 크다");
		}
		if( n3 > n1 && n3 > n2 ) {
			System.out.println("n3이 가장 크다");
		}
		*/
		
		//3. 두 수 입력 받고 두 수의 합이 짝수이고 3의 배수 출력
		System.out.println("두 수 입력");
		n1 = input.nextInt();
		n2 = input.nextInt();
		int sum = n1 + n2;
		if(sum % 2 == 0 && sum % 3 == 0) {//if(sum % 6 == 0) 
			System.out.println("맞다");
		}
	}
}













