package set_;

import java.util.ArrayList;
import java.util.HashSet;

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
		System.out.println( set );
		System.out.println( list );
		
		set.remove("순대");
		System.out.println( set );
		System.out.println( set.contains("순대") );
		
		//list.get(i);
	}
}












