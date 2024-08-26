package scanner;

import java.util.Scanner;
// java 라는 폴더에 util 폴더안에 Scanner 파일을 가지고오겠다.

public class Test01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("문자열 입력: ");
		String str = input.next();
		// .next() : 문자열을 입력받는다.
		System.out.println("입력 받은 값: " + str);
		
		int num;
		System.out.print("수 입력: ");
		num = input.nextInt();
		// .nextInt() : 정수값을 입력받는다.
		System.out.println("입력 수: " + num);
		
		System.out.print("실수 입력: ");
		double dou = input.nextDouble();
		// .nextDouble() : 실수값을 입력받는다.
		System.out.println("입력 수: " + dou);
		
		input.close();
		
	}

}
