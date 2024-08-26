package quiz;

import java.util.Scanner;

public class TestQuiz03 {

	public int[] inputNum() {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[2];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i +1) + "번째 수 입력: ");
			int num = input.nextInt();
			
			arr[i] = num;
		}
		
		return arr;
	}
	
	public int sumNum(int[] num) {
		
		int sum = 0;
		
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		
		return sum;
	}
	
	public void printNum(int sum) {
		System.out.println("두 수의 합은: " + sum);
	}
	
}
