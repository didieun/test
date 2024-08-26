package list_;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		for(int i=0; i<3 ; i++) {
			System.out.println(i+"번째 값 입력");
			String n = input.next();
			arr.add(n);
			//arr.add( input.next() );
		}
		System.out.println("기본 : "+arr);
		System.out.println("찾는 값 입력");
		String search = input.next();
		System.out.println( arr.indexOf(search) );
		System.out.println( arr.contains(search) );
		/*
		int index = input.nextInt();
		String msg = input.next();
		arr.set(index, msg);
		*/
		arr.set( 1 , "다른값");
		System.out.println( arr );
	}
}

















