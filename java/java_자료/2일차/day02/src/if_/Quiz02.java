package if_;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		// 커피 10개까지 2000, 초과 분 1500
		Scanner input = new Scanner(System.in);
		int coffee, money = 0;
		System.out.print("커피 수 입력 : ");
		coffee = input.nextInt();
		if( coffee > 10 ) {
			money += 20000 + (coffee - 10)*1500;
		}else {
			money = coffee * 2000;
		}
		System.out.println("coffee "+coffee+"가격은 : "+money+"입니다");

		//3,4의 배수 확인
		System.out.println("수 입력");
		int num = input.nextInt();
		if( num == 0 ) {
			System.out.println("0 안됨");
		}else if(num % 3 == 0 && num % 4 == 0) {
			System.out.println("3,4배수");
		}else if(num % 3 == 0) {
			System.out.println("3배수");
		}else if(num % 4 == 0 ) {
			System.out.println("4배수");
		}else {
			System.out.println("배수 아님");
		}
		/*
		if(num % 3 == 0 && num % 4 == 0 && num != 0) {
			System.out.println("3,4배수");
		}else if(num % 3 == 0 && num != 0) {
			System.out.println("3배수");
		}else if(num % 4 == 0 && num != 0) {
			System.out.println("4배수");
		}else if(num % 3 != 0 && num % 4 != 0) {
			System.out.println("배수 아님");
		}else {
			System.out.println("0은 안됨");
		}
		*/
	}
}











