package if_;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// 정수를 입력받아 아래와 같이 출력하시오.
		// 1. 3의 배수이면서, 4의 배수에도 해당합니다.
		// 2. 3의 배수에만 해당합니다.
		// 3. 4의 배수에만 해당합니다.
		// 4. 3의 배수도, 4의 배수도 해당안됩니다.
		// 5. 0은 잘못 입려했습니다.
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = input.nextInt();
		
		if(num == 0) {
			System.out.println("0은 잘못 입려했습니다.");
		} else if(num % 3 == 0 && num % 4 == 0) {
			System.out.println("3의 배수이면서, 4의 배수에도 해당합니다.");
		} else if(num % 3 == 0) {
			System.out.println("3의 배수에만 해당합니다.");
		} else if(num % 4 == 0) {
			System.out.println("4의 배수에만 해당합니다.");
		} else {
			System.out.println("3의 배수도, 4의 배수도 해당안됩니다.");
		}
		
		// 선생님 풀이
//		if(num % 3 == 0 && num % 4 == 0 && num != 0) {
//			System.out.println("3의 배수이면서, 4의 배수에도 해당합니다.");
//		} else if(num % 3 == 0 && num != 0) {
//			System.out.println("3의 배수에만 해당합니다.");
//		} else if(num % 4 == 0 && num != 0) {
//			System.out.println("4의 배수에만 해당합니다.");
//		} else if(num % 3 != 0 && num % 4 != 0 && num != 0) {
//			System.out.println("3의 배수도, 4의 배수도 해당안됩니다.");
//		}
//		else {
//			System.out.println("0은 잘못 입려했습니다.");
//		}
		
		input.close();

	}

}
