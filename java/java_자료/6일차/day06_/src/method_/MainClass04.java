package method_;

import java.util.Scanner;

public class MainClass04 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num = 0 , sum = 0;
	System.out.println("수 입력");
	num = input.nextInt();
	
	TestClass04 t = new TestClass04();
	t.sumFunc( num );
}
}










