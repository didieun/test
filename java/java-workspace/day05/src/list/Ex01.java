package list;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		// Wrapper Class
		// - 클래스의 자료형은 첫번째 글자는 대문자이다.
		
		int num = 10;
		System.out.println(num);
		
		Integer num2 = 100;
		System.out.println(num2);
		
		
		// ArrayList 컬렉션
		// 여러개의 값을 저장 하는 리스트를 만들거고, <> 이안에는 첫글자가 대문자인 클래스 자료형이 들어간다.
		ArrayList<Integer> arr = new ArrayList<>();
//		arr[0] = 100; // 기존 배열은 인덱스값을 넣고 저장하는가 반면
		arr.add(100);  // ArrayList는 공간이 정해져있지 않아서 인덱스번호를 안쓰고 add 로 넣으면 순차적으로 저장이 된다.
		arr.add(200);
		
		System.out.println(arr.get(0)); // 값얻어올땐 get 을 사용하여 몇번째 인덱스를 가져올지 작성 하면된다.
		System.out.println(arr.get(1));
		
		System.out.println(arr.size()); // length 와 비슷하게 ArrayList에서는 size 로 저장된 갯수를 알수가 있다.
		
		int[] arr2 = new int[3];
		System.out.println(arr2.length);  // 배열은 length 로 사용하면 된다.
		
		ArrayList<String> arr3 = new ArrayList<>();
		arr3.add("aaa");
		arr3.add("bbb");
		
		System.out.println("---- 기본 ----");
		System.out.println(arr3); 
		
		System.out.println("---- for문 ----");
		for(int i = 0; i < arr3.size(); i++) {
			System.out.println(arr3.get(i));
		}
		
		System.out.println("---- foreach ----");
		for(String s : arr3) {
			System.out.println(s);
		}
		

	}

}
