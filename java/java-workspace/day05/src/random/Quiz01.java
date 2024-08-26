package random;

import java.util.*;

public class Quiz01 {

	public static void main(String[] args) {
		
		/*
		 로또 프로그램 list, set 이용 45개의 숫자중 중복되지 않는 6개의 숫자 저장 후 출력 
		 */
		
		ArrayList<Integer> list = new ArrayList<>();
		int random = 0;
		
		
		
		while(list.size() <= 6) {
			random = (int)(Math.random() * 45) + 1;
			if(!list.contains(random)) {
				list.add(random);
			}
		}
		
		System.out.print("로또번호: ");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println("");
		
		Random rand = new Random();
		HashSet<Integer> set = new HashSet<>();
		
		while( set.size() <= 6 ) {
			random = rand.nextInt(45) + 1;
			set.add(random);
		}
		
		Iterator<Integer> iter = set.iterator();
		
		System.out.print("로또번호: ");
		while(iter.hasNext()) {
			int num = iter.next();
			System.out.print(num + " ");
		}

	}

}
