package quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TestQuiz05 {
	public HashMap<Integer, Integer> inputNum() {
		
		Scanner input = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<>();

		int i = 1;
		while(true) {
			System.out.print(i + "번째 수 입력: ");
			int num = input.nextInt();
			
			map.put(i, num);
			
			if(map.size() == 2) {
				break;
			}
			i++;
		}
		
		return map;
	}
	
	public int sumNum(HashMap<Integer, Integer> num) {
		
		int sum = 0;

		Set<Integer> set = num.keySet(); 
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			int key = it.next();
			int value = num.get(key);
			sum += value;
		}
		
		return sum;
	}
	
	public void printNum(int sum) {
		System.out.println("두 수의 합은: " + sum);
	}
}
