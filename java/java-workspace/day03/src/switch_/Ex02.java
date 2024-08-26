package switch_;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num, result;
		
		System.out.print("수 입력: ");
		num = input.nextInt();
		
		result = num % 2;
		
		// if(num % 2 == 0)
		// switch(result) 
		switch(num % 2) {
			case 0:
				System.out.println("짝");
				break;
			default:
				System.out.println("홀");
//				break;
		}
		
		System.out.print("문자열 입력: ");
		String str = input.next();
		
		switch(str) {
			case "안녕" :
			System.out.println(str + " 하세요");
			break;
			case "그래":
			System.out.println(str + " 반갑다");
			
		}
		// default 는 생략 가능 

	}

}
