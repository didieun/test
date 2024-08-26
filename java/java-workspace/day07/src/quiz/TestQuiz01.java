package quiz;

import java.util.Scanner;

public class TestQuiz01 {

	public int[] inputMethod() {
		Scanner input = new Scanner(System.in);
		
		int[] number = new int[2];
		int num;
		
		for(int i = 0; i < number.length; i++) {
			
			System.out.print((i + 1) + "번째 수 입력: ");
			num = input.nextInt();
			
			number[i] = num;
		}
		
		return number ;
	}
	
	public int testMethod(int[] number) {
		
		if(number[0] > number[1]) {
			return 0;
		} else if(number[0] < number[1]){
			return 1;
		} else {
			return 2;
		}
	
	}
	
	public void outputMethod(int[] number, int a) {
		
		switch(a) {
		case 0:
			System.out.println(number[0] + " 더 큰수");
			break;
		case 1: 
			System.out.println(number[1] + " 더 큰수");
			break;
		case 2:
			System.out.println("두 수가 같다.");
			break;
		
		}
		
	}
}
