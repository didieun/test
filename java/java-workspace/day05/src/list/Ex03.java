package list;

import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		for(int i = 0; i < 3; i++) {
			System.out.print(i + "번째 값 입력: ");
			
			String n = input.next();
			arr.add(n);
			// arr.add(input.next()); // 위에 두줄 코드를 이렇게 한줄로도 가능하다.
		}
		
		System.out.println("기본 : " + arr);
		System.out.print("찾는 값 입력: ");
		String search = input.next();
		System.out.println(arr.indexOf(search)); // .indexOf(search) : 찾는값의 인덱스를 알려줌(찾는값이 있으면 인덱스값, 찾는값이 없으면 -1) 
		System.out.println(arr.contains(search)); // .contains(search) : 찾는값이 있으면 true, 찾는값이 없으면 false
		
		/*
		int index = input.nextInt();
		String msg = input.next();
		arr.set(index, msg);
		*/
		
		arr.set(1, "다른값"); // .set(index, 값): 몇번째의 값을 다른값으로 변경하겠다.
		System.out.println(arr);
		
		input.close();
	}

}
