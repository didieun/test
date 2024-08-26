package map;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		map.put("num", "100"); // 첫번째는 키값(key), 두번째는 값(value) 
		map.put("name", "홍길동");
		
		System.out.println(map);
		System.out.println(map.get("num"));
		System.out.println(map.get("name"));
		System.out.println(map.get("없는 키"));
		
		HashMap<String, Integer> map2 = new HashMap<>();
		map2.put("age", 20);
		map2.put("num", 12345);
		
		int num = map2.get("num");
		System.out.println("num: " + num);
		System.out.println("get: " + map2.get("num"));
		
		// 값을 연산할거면 값을 꺼내와서 변수에 저장한뒤 연산함.
		int age = map2.get("age");
		age -= 1;
		System.out.println("age: " + age);
		System.out.println("get age: " + map2.get("age"));
		
		System.out.println(map2.containsKey("age"));
		System.out.println(map2.containsValue(20));		// value 값이 있으면 true
		System.out.println(map2.containsValue(1111));   // value 값이 없으면 false
		
		System.out.println("변경 전: " + map2);
		map2.put("age", 5555);	// key 값이 동일하면 key 값은 중복이 안되기 때문에 value 값이 마지막으로 저장됨.
		map2.put("a", 20);      // 동일한 key 값이 없으면 추가가됨.
		System.out.println("변경 후: " + map2);
		
		map2.remove("age");
		System.out.println("삭제 후: " + map2);
	}

}
