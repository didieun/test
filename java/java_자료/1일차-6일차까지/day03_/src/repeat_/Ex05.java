package repeat_;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, sum = 0;
		while( true ) {
			System.out.println("1~10사이 수 입력");
			i = input.nextInt();
			if( i <= 0 || i > 10 ) {
				System.out.println("다시 입력...");
				continue;
			}
			break;
		}
		for(int k=0 ; k <= i ; k++) {
			sum += k;
		}
		System.out.println("1 ~ " + i + "까지의 합 : "+sum);
	}
}










