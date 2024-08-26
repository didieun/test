package repeat;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num;
		String id = "", pw = "", strId, strPw;
		boolean bool = true;
		
		while(bool) {
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
					
					if(id == "" || pw == "") {
						System.out.println("인증 실패!!!");
					} else if(!strId.equals(id) || !strPw.equals(pw)) {
						System.out.println("인증 실패!!!");
					} else {
						System.out.println("인증 성공!!!");
					}
					
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
					bool = false;
					System.out.println();
					break;
				default:
					System.out.println("다시 입력해주세요!!");
					System.out.println();
			}
	
		}
		
		input.close();
		
	}

}
