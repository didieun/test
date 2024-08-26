package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class TestQuiz04 {
	public ArrayList<Integer> inputNum() {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		int i = 1;
		while(true) {
			System.out.print(i + "번째 수 입력: ");
			int num = input.nextInt();
			
			list.add(num);
			
			if(list.size() == 2) {
				break;
			}
			i++;
		}
		
		return list;
	}
	
	public int sumNum(ArrayList<Integer> num) {
		
		int sum = 0;
		
		for(int i = 0; i < num.size(); i++) {
			sum += num.get(i);
		}
		
		return sum;
	}
	
	public void printNum(int sum) {
		System.out.println("두 수의 합은: " + sum);
	}
}
