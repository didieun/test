package array;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] id = new String[5];
		String[] pw = new String[5];
		
		String inputId = " ", inputPw = " ";
		int num;
		boolean bool = true;
		
		while(bool) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 모든 회원보기");
			System.out.println("4. 수정");
			System.out.println("5. 삭제");
			System.out.println("6. 나가기");
			System.out.print(">>> " );
			num = input.nextInt();
		
			System.out.println();
			
			switch(num) {
				case 1:
					System.out.print("아이디 입력: ");
					inputId = input.next();
					
					System.out.print("비밀번호 입력: ");
					inputPw = input.next();
					
					for(int i = 0; i < id.length; i++) {
						
						if(inputId.equals(id[i]) && inputPw.equals(pw[i])) {
							System.out.println("인증 통과!!");
							break;
						} else {
							if(id[i] == null) {
								System.out.println("존재하지 않는 아이디 입니다.");
							} else {
								if(!id[i].equals(inputId)) {
									System.out.println("존재하지 않는 아이디 입니다.");
								} else if(!pw[i].equals(inputPw)){
									System.out.println("비밀번호가 틀렸습니다.");
								}
							}
							
							break;
						}
					}
					
					System.out.println();
					break;
				case 2:
					
					System.out.print("저장할 아이디 입력: ");
					inputId = input.next();
					
					System.out.print("저장할 비밀번호 입력: ");
					inputPw = input.next();
					
					int k = 0;
					
					for(k = 0; k < id.length; k++) {
						if(id[k] == null) {
							id[k] = inputId;
							pw[k] = inputPw;
							break;
						}
						if(inputId.equals(id[k])) {
							System.out.println("동일한 아이디가 존재합니다.");
							System.out.print("저장할 아이디 입력: ");
							inputId = input.next();
							break;
							
						}
					}	
					
					if(k == id.length) {
						System.out.println("더이상 저장 할 공간이 없습니다.");
					} else {
						System.out.println("가입을 축하합니다.");
					}
					
					System.out.println();
					break;
				case 3: 
					System.out.println("=== 회원 정보 ===");
					for(int i = 0; i < id.length; i++) {
						if(id[i] != null) {
							System.out.println((i + 1) + ". " + id[i] + ", " + pw[i]);
						}
					}
					System.out.println();
					break;
				case 4: 
					
					System.out.print("수정할 아이디 입력: ");
					inputId = input.next();
					
					// 무한 반복
					for(int i = 0; ; i++) {
						if(i == id.length) {
							System.out.println("해당 id는 존재하지 않습니다.");
							break;
						}
						if(inputId.equals(id[i])) {
							System.out.print("변경할 비밀번호 입력: ");
							inputPw = input.next();
							
							pw[i] = inputPw;
							System.out.println("변경 완료 되었습니다.");
							
						}
					}
					
					System.out.println();
					break;
				case 5: 
					System.out.print("삭제할 아이디 입력: ");
					inputId = input.next();
					
					for(int i = 0; i < id.length; i++) {
						if(i == id.length) {
							System.out.println("해당 id는 삭제할 수 없습니다.");
							break;
						}
						if(inputId.equals(id[i])) {	
							id[i] = null;
							System.out.println("회원이 삭제 되었습니다.");
							break;
						}
					}
					
					System.out.println();
					break;	
				case 6:
					System.out.println("종료합니다.");
					bool = false;
					System.out.println();
					break;
				default:
					System.out.println("메뉴를 다시 입력해주세요!!");
					System.out.println();
			}
			
		}
		
		input.close();

	}

}
