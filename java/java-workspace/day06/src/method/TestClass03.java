package method;

import java.util.Scanner;

public class TestClass03 {

	public void test() {
		System.out.println("test");
	}
	
	public void sumFunc() {
		Scanner input = new Scanner(System.in);
		int num = 0, sum = 0;
		System.out.print("수 입력: ");
		num = input.nextInt();
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1 ~ " + num + "까지의 합: " + sum);
	}
	
}
