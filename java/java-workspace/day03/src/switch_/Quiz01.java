package switch_;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		// 날짜를 입력받아 1이면 '월' 2일이면 '화' ... 7일 '일' 8일 '월' 숫자에 맞춰 요일을 출력 
		
		Scanner input = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("날짜 입력: ");
			int num = input.nextInt();
			
			switch(num % 7){
				case 0: 
					System.out.println(num + "일은 일요일 입니다.");
					break;
				case 1: 
					System.out.println(num + "일은 월요일 입니다.");
					break;
				case 2: 
					System.out.println(num + "일은 화요일 입니다.");
					break;
				case 3: 
					System.out.println(num + "일은 수요일 입니다.");
					break;
				case 4: 
					System.out.println(num + "일은 목요일 입니다.");
					break;
				case 5: 
					System.out.println(num + "일은 금요일 입니다.");
					break;
				case 6: 
					System.out.println(num + "일은 토요일 입니다.");
					break;
			}
			
			input.close();
		}

	}

}
