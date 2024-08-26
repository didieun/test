package scanner;
import java.util.Scanner;
public class Test01 {
	public static void main(String[] args) {
		Scanner aaa = new Scanner(System.in);
		
		System.out.println("문자열 입력 : ");
		String str = aaa.next();
		System.out.println("입력 받은 값 : "+str);
		
		int num;
		System.out.print("수 입력 : ");
		num = aaa.nextInt();
		System.out.println("입력 수 : "+num);
		
		System.out.println("실수 입력 : ");
		double dou = aaa.nextDouble();
		System.out.println("입력 수 : "+dou);
		
		
	}
}







