package quiz;

import java.util.Scanner;

public class TestQuiz05 {

	public int inputMethod() {
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.print("수 입력: ");
		num = input.nextInt();
		
		return num ;
	}
	
	
	public int testMethod(int num) {
		
		if(num < 0) {
			return -num;
		} else {
			return num;
		}
		
	}
	
	public void outputMethod(int num, int result) {
		System.out.println("입력값: " + num);
		System.out.println("절대값: " + result);
	}
	
}
