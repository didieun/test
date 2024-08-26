package set;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		ArrayList<String> list = new ArrayList<>();
		
		set.add("라면");
		set.add("순대");
		set.add("김밥");
		set.add("라면");
		
		list.add("라면");
		list.add("순대");
		list.add("김밥");
		list.add("라면");
		
		System.out.println(set);
		System.out.println(list);
		
		set.remove("순대"); // set 은 인덱스가 없기 때문에 remove 에서는 값만 넣을수 있다.
		System.out.println(set);
		
		System.out.println(set.size());
		System.out.println(set.contains("김밥"));
		
		// list.get(i);
		
	}

}
