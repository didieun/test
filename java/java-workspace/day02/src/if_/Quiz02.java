package if_;

import java.util.Scanner;
public class Quiz02 {

	public static void main(String[] args) {
		
		// 커피의 개당 가격은 2000원이다. 10개 초과하면 초과하는 양에 대해서만 개당 1500원씩 받는다. 커피의 개수를 입력 받아 금액을 출력하시오.
		Scanner input = new Scanner(System.in);
		
		int count = 0;
		int price = 0;
		int sum = 0;
		
		System.out.print("커피 갯수: ");
		count = input.nextInt();
		
		if(count <= 10) {
			price = 2000;
			sum = count * 2000;
		} else {
			price = 1500;
			int n = count - 10;
			sum = 20000 + (n * price);
		}
		
		System.out.println("커피 " + count + "잔의 금액은 " + sum + "원 입니다.");
		
		// 선생님 풀이
		int coffee, money = 0;
		System.out.print("커피 수 입력: ");
		coffee = input.nextInt();
		
		if(coffee > 10) {
			money = 20000 + (coffee -10) * 1500;
		} else {
			money = coffee * 2000;
		}
		
		System.out.println("커피 " + coffee + "잔의 금액은 " + money + "원 입니다.");
		
		input.close();

	}

}
