package repeat;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String n1, n2;
		System.out.print("문자열 입력: ");
		n1 = input.next();
		
		System.out.print("문자열 입력: ");
		n2 = input.next();
		
		System.out.println("n1 == n2 : " + (n1 == n2));
		System.out.println("n1.equals(n2) : " + n1.equals(n2));
		// .equals :  문자열 비교
		
		if(n2.equals(n1)) {
			System.out.println("두 이름이 같다.");
		} else {
			System.out.println("두 이름이 다르다!!");
		}
		
		String name1 = null, name2 = "test";

//		System.out.println(name1.equals(name2));
		System.out.println(name2.equals(name1));
		// 기준을 가지고 있는 값이 있으면 false, 기준을 가지고 있는 변수가 값이 null 값이면 에러가남! 
		
		// null 값을 비교할때는 == 연산자 사용 
		if(name1 == null) {
			System.out.println("name1 은 null");
			
		}

	}

}
