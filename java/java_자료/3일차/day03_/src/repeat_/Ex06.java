package repeat_;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String n1, n2;
		System.out.println("문자열 입력");
		n1 = input.next();
		
		System.out.println("문자열 입력");
		n2 = input.next();
		
		System.out.println("n1 == n2 : "+ ( n1==n2 ) );
		System.out.println("n1.equals(n2) : "+ n1.equals(n2) );
		
		if( n2.equals(n1) ) {
			System.out.println("두 이름 같다");
		}else {
			System.out.println("다르다!!!!");
		}
		
		String name1 = null, name2 = "test";
		System.out.println( name2.equals(name1) );
		if(name1 == null) {
			System.out.println("name1은 null");
		}
		
	}
}












