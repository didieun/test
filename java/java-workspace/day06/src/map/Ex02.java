package map;

import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		
		int num = 100;
//		System.out.println(num + " , ");
		String str = num + "";
		// 기본형을 String 으로 형변환 할려면 + "" 으로 해주면 문자열로 형변환이 됨.
		// 또는 Integer.toString();
		String str2 = Integer.toString(num);
		
		int a = Integer.parseInt(str);
		// 문자열을 int 형태로 형변환은 -> Integer.parseInt(); 
		
		HashMap<String, String> map = new HashMap<>();
		map.put("이름", "홍길동");
		map.put("나이", "20");
		String age = map.get("나이");
		
		int age2 = Integer.parseInt(age) - 1; // 형변환 
		// 또는 
		age = Integer.parseInt(age) - 1 + "";  // 형변환 
		
		System.out.println("age2: " + age2);
		System.out.println("age: " + age);
		
		System.out.println("map: " + map);
		
		Set<String> set = map.keySet();  // .keySet : key 값만 꺼내와서 Set 으로 저장함.
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}
		
	}

}
