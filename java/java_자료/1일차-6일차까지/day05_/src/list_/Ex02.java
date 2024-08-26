package list_;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		//System.out.println( arr.add("1111") );
		//System.out.println( arr.get(0) );
		boolean bool = arr.add("1111");
		String s = arr.get(0);
		s += "수정";
		System.out.println( s );
		/*
		Scanner input = new Scanner(System.in);
		String name = input.next();
		int i = input.nextInt();
		*/
		arr.add("111");
		arr.add("222");
		arr.add("333");
		
		System.out.println( arr.contains("222") );
		System.out.println( arr.contains("없는값") );
		
		boolean b = arr.contains("특정 값");
		if( b ) {// b == true
			System.out.println("존재합니다");
		}else {
			System.out.println("존재하지 않습니다!!!!");
		}
		
		System.out.println("삭제 전 : "+arr);
		System.out.println( arr.remove(0) );
		System.out.println("삭제 후 : "+arr);
		System.out.println( arr.size() );
		if( arr.size() > 5)
			System.out.println( arr.remove(5) );
		
		System.out.println("-------------");
		System.out.println( arr.remove("222") );
		System.out.println( arr.remove("없는값") );
		
	}
}



















