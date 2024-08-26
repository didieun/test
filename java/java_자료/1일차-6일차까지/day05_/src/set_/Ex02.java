package set_;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		/*
		ArrayList arr = new ArrayList();
		arr.add(111);
		arr.add(111.111);
		arr.add("문자열");
		System.out.println( arr );
		*/
		ArrayList<String> arr = new ArrayList<>();
		arr.add("111");
		arr.add("222");
		arr.add("333");
		System.out.println( arr );
		
		Iterator<String> it = arr.iterator();
		while( it.hasNext() ) {
			String n = it.next();
			System.out.println( n );
		}
		/*
		System.out.println( it.hasNext() );
		System.out.println( it.next() );
		System.out.println( it.hasNext() );
		System.out.println( it.next() );
		System.out.println( it.next() );
		System.out.println( it.hasNext() );
		System.out.println( it.next() );
		*/
		System.out.println( "--- set ---");
		HashSet<Integer> set = new HashSet<>();
		set.add(111);
		set.add(222);
		set.add(333);
		System.out.println( set );
		Iterator<Integer> s = set.iterator();
		while( s.hasNext() ) {
			int num = s.next();
			System.out.println( num );
		}
	}
}














