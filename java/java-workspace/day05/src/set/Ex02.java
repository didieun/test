package set;

import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		// iterator 반복자.
		
//		ArrayList arr = new ArrayList();
//		// 위와 같은 장점은 똑같이 사용하면서 아무값이나 넣을수 있다.(자료형을 안써도 되긴하다..)
//		// 단점은 값을 꺼내올때 많은 값이 저장할때 몇번째 어떤자료형이 들어가있는지 모르니깐 문제가 생길수도 있다.
//		arr.add(111);
//		arr.add(111.111);
//		arr.add("문자열");
//		System.out.println(arr);

		// 웹쪽에 갈때 많이 쓰니깐 중요!!
		ArrayList<String> arr = new ArrayList<>();
		arr.add("111");
		arr.add("222");
		arr.add("333");
		System.out.println(arr);
		
		// .iterator() : 반복자! iterator 자료형으로 받아야됨.
		Iterator<String> it = arr.iterator();
		
//		System.out.println(it.hasNext());  // .hasNext() : 값이 있으면 true, 없으면 false
//		System.out.println(it.next());     // .next() : 다음위치에 있는 값을 꺼내온다.
//		System.out.println(it.hasNext());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.hasNext());
//		//System.out.println(it.next());		// 다음 위치에 값이 없기 때문에 에러
		
		while(it.hasNext()) {
			String n = it.next();
			System.out.println(n);
		}
		
	    HashSet<Integer> set = new HashSet<>();
	    set.add(111);
	    set.add(222);
	    set.add(333);
	    
	    System.out.println(set);
	    Iterator<Integer> s = set.iterator();
	    
	    while(s.hasNext()) {
	    	int num = s.next();
	    	System.out.println(num);
	    }
		
	}

}
