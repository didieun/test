package method;

import java.util.Scanner;

public class TestClass06 {
	
	public String test(int num) {
		
		return "aaa";
	}

	public int inputData() {
		Scanner input = new Scanner(System.in);
		System.out.print("수 입력: ");
		int num = input.nextInt();
//		System.out.println("num: " + num);
		return num;
	}
	
	public int opData(int num) {
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
//		System.out.println("합: " + sum);
		return sum;
	}
	
	public void printData(int num, int s) {
		System.out.println(num + "까지 합: " + s);
		
	}

}
