package repeat_;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num;
		String id = null, pw = null, strId = null, strPw = null;
		
		while(true) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 나가기");
			System.out.print(">>> " );
			num = input.nextInt();
			
			switch(num) {
				case 1:
					System.out.print("아이디 입력: ");
					strId = input.next();
					System.out.print("비밀번호 입력: ");
					strPw = input.next();
					
					System.out.println(id);
					System.out.println(pw);
					System.out.println(strId);
					System.out.println(strPw);
					
					System.out.println();
					break;
				case 2:
					System.out.print("저장할 아이디 입력: ");
					id = input.next();
					System.out.print("저장할 비밀번호 입력: ");
					pw = input.next();
					
					System.out.println("가입 완료!!!");
					System.out.println();
					break;
				case 3:
					System.out.println("종료합니다.");
					System.out.println();
					break;
				default:
					System.out.println("다시 입력해주세요!!");
					System.out.println();
			}
			if(num==3)break;
			
		}
		input.close();
	}
}




