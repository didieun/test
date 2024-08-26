package switch_;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		// 우리집, 회사 등록 후 보기. 
		Scanner input = new Scanner(System.in);
		
		String home = null, conpany = null;
		
		while(true) {
			
			System.out.println("1. 우리집 등록");
			System.out.println("2. 회사 등록");
			System.out.println("3. 등록 보기");
			
			System.out.print("번호 입력: ");
			int num = input.nextInt();
			
			input.close();
			
			System.out.println();
			
			switch(num) {
				case 1:
					System.out.print("우리집 목적지 입력: ");
					home = input.next();
					System.out.println("등록 성공");
					System.out.println();
					break;
				case 2:
					System.out.print("회사 목적지 입력: ");
					conpany = input.next();
					System.out.println("등록 성공");
					System.out.println();
					break;
				case 3:
					if(home == null) {
						System.out.println("집 주소 등록하세요.");
						
					} else {
						System.out.println("우리집: " + home);
					}
					
					if(conpany == null) {
						System.out.println("집 주소 등록하세요.");
						
					} else {
						System.out.println("회사: " + conpany);
					}
					
					System.out.println();
					break;
				default:
					System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
					System.out.println();
					break;
			}
		}
		
	}

}
