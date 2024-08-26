package switch_;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		String home = null, office = null;
		int num;
		while( true ) {
			System.out.println("1.우리집");
			System.out.println("2.회사");
			System.out.println("3.보기");
			num = input.nextInt();
			switch ( num ) {
			case 1:
				System.out.println("집 입력 ");
				home = input.next();
				System.out.println("성공");
				break;
			case 2:
				System.out.println("회사 입력 ");
				office = input.next();
				System.out.println("성공");
				break;
			case 3:
				if( home == null )
					System.out.println("집 주소 등록하세요");
				else
					System.out.println(home);
				if( office == null )
					System.out.println("회사 주소 등록하세요");
				else
					System.out.println(office);
				//System.out.println(home + office);
				break;
			}
		}
	}
}












