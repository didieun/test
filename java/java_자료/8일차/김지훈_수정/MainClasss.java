package Common;
//휴대폰
//1. 전원 
//  - 배터리
//2. 전화
// - 전화 받고 끊고
// - 수신차단
// - 연락처 등록
//3. 문자
//4. 노래
// - 수신, 발신
//5. 사진
//6. 은행

import java.util.Scanner;

public class MainClasss {

   public static void main(String[] args) {
	   Call_Operate co = new Call_Operate();
	  
      Scanner input = new Scanner(System.in);
      int num;
      while(true) {
         System.out.println("메뉴를 선택하세요");
         System.out.println("1. 전원");
         System.out.println("2. 전화");
         System.out.println("3. 문자");
         System.out.println("4. 노래");
         System.out.println("5. 사진");
         System.out.println("6. 은행");
         System.out.print(">>> ");
         num = input.nextInt();
         switch(num) {
         case 1:break;
         case 2:
        	 co.display();
        	 break;
         case 3:break;
         case 4:break;
         case 5:break;
         case 6:break;
         }
      }

   }

}
