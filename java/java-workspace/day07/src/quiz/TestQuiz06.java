package quiz;

import java.util.Scanner;

public class TestQuiz06 {
	
	public int inputMethod() {
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		System.out.print("수 입력 : ");
		num = input.nextInt();
		
		return num;
	}

	public int reverse(int num) {
		
		int temp = 0;
		
		while(true) {
			
			temp = num % 10;
			num = num / 10;
			
			outputMethod(temp);
			
			if(num == 0) {
				break;
			}
		}
		
		return temp;
	}
	
	public void outputMethod(int temp) {
		
		System.out.print( temp + ", ");
	}
	
}
