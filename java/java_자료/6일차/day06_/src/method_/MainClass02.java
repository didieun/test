package method_;

import java.util.Scanner;

public class MainClass02 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num;
	//System.out.println("수 입력");
	//num = input.nextInt();
	TestClass02 t = new TestClass02();
	num = t.test();
	if( num % 2 == 0) {
		System.out.println("짝");
	}else {
		System.out.println("홀");
	}
	num = t.test();
	//System.out.println("수 입력");
	//num = input.nextInt();
	if( num % 3 == 0) {
		System.out.println("3333짝");
	}else {
		System.out.println("xxxxx홀");
	}
}
}





