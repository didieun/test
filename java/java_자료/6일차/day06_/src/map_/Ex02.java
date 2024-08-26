package map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex02 {
public static void main(String[] args) {
	int num = 100;
	//System.out.println(num + " , ");
	//String str = num + "";
	String str = Integer.toString(num);
	int a = Integer.parseInt( str );
	
	HashMap<String, String> map = new HashMap<>();
	map.put("이름", "홍길동");
	map.put("나이", "20" );
	String age = map.get("나이");
	
	int age2 = Integer.parseInt(age) - 1;
	age = Integer.parseInt(age) - 1 + "";
	
	System.out.println("age2 : "+age2);
	System.out.println("age : "+age);
	
	System.out.println("map : "+map);
	Set<String> set = map.keySet();
	Iterator<String> it = set.iterator();
	while( it.hasNext() ) {
		//System.out.println( it.next() );
		String key = it.next();
		//map.get("이름");
		//map.get("나이");
		System.out.println(key + " : " + map.get(key));
	}
	
}
}























