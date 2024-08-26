package quiz;

import java.util.Scanner;

public class TestQuiz03 {

	public int inputMethod() {
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.print("수 입력: ");
		num = input.nextInt();
		
		return num ;
	}
	
	public int testMethod(int num) {
		
		if(num % 3 == 0) {
			return 0;
		}else {
			return 1;
		}
		
	}
	
	public void outputMethod(int a) {
		
		if(a == 0) {
			System.out.println("3의 배수 입니다.");
		}else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
	}
	
}