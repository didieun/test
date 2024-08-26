package switch_;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int day;
		//1-7, 8-14 ,,,,
		while(true) {
			System.out.println("수 입력");
			day = input.nextInt();
			//System.out.println( day / 7 );
			//System.out.println( day % 7 );
			switch ( day % 7 ) {
				case 1: System.out.println("월");break;
				case 2: System.out.println("화");break;
				case 3: System.out.println("수");break;
				case 4: System.out.println("목");break;
				case 5: System.out.println("금");break;
				case 6: System.out.println("토");break;
				case 0: System.out.println("일");break;
			}
		}
	}
}










