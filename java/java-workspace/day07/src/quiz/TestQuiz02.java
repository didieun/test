package quiz;

import java.util.Scanner;

public class TestQuiz02 {

	public int inputMethod() {
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.print("수 입력: ");
		num = input.nextInt();
		
		return num ;
	}
	
	public String testMethod(int num) {
		
		String msg = null;
		
		if(num % 2 == 0) {
			msg = "짝수 입니다.";
		}else {
			msg = "홀수 입니다.";
		}
		return msg;
	}
	
	public void outputMethod(String msg) {
		
		System.out.println(msg);
		
	}
	
}
