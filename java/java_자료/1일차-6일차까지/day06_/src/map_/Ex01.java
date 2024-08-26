package map_;

import java.util.HashMap;

public class Ex01 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("num", "100");
		map.put("name", "홍길동");
		
		System.out.println( map );
		System.out.println( map.get("num") );
		System.out.println( map.get("name") );
		System.out.println( map.get("없는 키") );
		
		HashMap<String, Integer> map2 = new HashMap<>();
		map2.put("age", 20);
		map2.put("num", 12345);
		
		int num = map2.get("num");
		System.out.println("num : "+num);
		System.out.println("get : "+map2.get("num"));
		
		int age = map2.get("age");
		age -= 1;
		System.out.println("age : "+age);
		System.out.println("get age : "+map2.get("age") );
		
		System.out.println( map2.containsKey("age") );
		System.out.println( map2.containsValue(1111) );
		
		System.out.println("변경 전 : "+map2);
		map2.put("age", 5555);
		map2.put("a", 20);
		System.out.println("변경 후 : "+map2);
		
		map2.remove("age");
		System.out.println("삭제 후 : "+map2);
	}
}













