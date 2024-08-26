package quiz;

import java.util.Scanner;

public class TestQuiz04 {

	public int inputMethod() {
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.print("수 입력: ");
		num = input.nextInt();
		
		return num ;
	}
	
	public int testMethod(int num) {
		
		int cnt = 0;
		
		for(int i = 1; i <= num; i++) {
//			System.out.println("num: " + num + ", i: " + i);
//			System.out.println(num % i);
			
			if(num % i == 0) {
				cnt++;
			}
		}
		
		return cnt;
	}
	
	public void outputMethod(int num, int cnt) {
		
		if(cnt == 2) {
			System.out.println(num + "은 소수입니다.");
		} else {
			System.out.println(num + "은 소수가 아닙니다.");
		}
		
	}
}
