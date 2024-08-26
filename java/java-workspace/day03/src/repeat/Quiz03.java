package repeat;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int money = 0, number;
		boolean bool = true;
		
		System.out.print("요금을 투입하세요 >>> ");
		money = input.nextInt();
		

		System.out.println();
		
		while(bool) {	
			System.out.println("========== 커피 자판기 ============");
			System.out.println("1. 커피(200) \t 2. 코코아(250) \t 3. 반환 \t 4. 종료");
			System.out.print("메뉴를 선택하세요 >>> ");
			number = input.nextInt();
			
			System.out.println();
			
			switch(number) {
				case 1:
					if(money == 0) {
						System.out.println("요금이 부족합니다.");
					} else {
						money -= 200;
						System.out.println("맛있게 드세요.");
					}
					System.out.println();
					break;
				case 2:
					if(money == 0) {
						System.out.println("요금이 부족합니다.");
					} else {
						money -= 250;
						System.out.println("맛있게 드세요.");
					}
					System.out.println();
					break;
				case 3:
					System.out.println("거스름돈: " + money);
					money = 0;
					System.out.println();
					break;
				case 4:
					System.out.println("종료합니다.");
					bool = false;
					System.out.println();
					break;
				default:
					System.out.println("메뉴를 다시 선택해주세요.");
					System.out.println();
					break;
			}
					
		}
		input.close();
		
	}

}
