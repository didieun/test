package array_;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String [] id = new String[5];
		String [] pwd = new String[5];
		int num;
		String inputId=null, inputPwd=null;
		while(true) {
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.모든 목록");
			System.out.println("4.수정");
			System.out.println("5.삭제");
			System.out.println("6.종료");
			System.out.print(">>> : ");
			num = input.nextInt();
			switch (num) {
			case 1: 
				System.out.println("아이디 입력");
				inputId = input.next();
				System.out.println("비밀번호 입력");
				inputPwd = input.next();
				for(int k=0;  ; k++ ) {
					if(k == id.length ) {
						System.out.println("존재하지 않는 id");
						break;
					}
					if( inputId.equals( id[k] ) ) {
						if(inputPwd.equals(pwd[k]) ) {
							System.out.println("인증 통과");
							//break;
						}else {
							System.out.println("비번 틀림");
							//break;
						}
						break;
					}
				}
				
				break;
			case 2: 
				boolean bool = true;
				while(bool) {
					System.out.println("아이디 입력");
					inputId = input.next();
					for(int j=0; ; j++) {
						if( j == id.length ) {
							System.out.println("가입 가능 id");
							bool = false;
							break;
						}
						
						if( id[j] != null && id[j].equals(inputId) ) {
							System.out.println("존재하는 id");
							break;
						}
					}
				}

				System.out.println("비밀번호 입력");
				inputPwd = input.next();
				int k = 0;
				for( k=0; k < id.length ; k++) {
					if( id[k] == null ) {
						id[k] = inputId;
						pwd[k] = inputPwd;
						break;
					}
					if( id[k].equals(inputId) ) {
						System.out.println("존재하는 id");
						break;
					}
				}
				if( k == id.length ) {
					System.out.println("공간이 없다!!!");
				}
				break;
			case 3:
				for(int i=0 ; i<id.length ; i++) {
					if( id[i] != null )
						System.out.println(id[i]+":"+pwd[i]);
				}
				break;
			case 4: 
				System.out.println("id 입력");
				inputId = input.next();
				for(int j=0 ;  ; j++) {
					if(j == id.length ) {
						System.out.println("존재하지 id 임");
						break;
					}
					if( inputId.equals(id[j]) ) {
						System.out.println("pwd 입력");
						inputPwd = input.next();
						pwd[j] = inputPwd;
						System.out.println("수정 완료");
						break;
					}
				}
			
				break;
			case 5 :
				System.out.println("삭제 id 입력");
				inputId = input.next();
				for(int j=0 ;  ; j++) {
					if(j == id.length ) {
						System.out.println("존재하지 id 임");
						break;
					}
					if( inputId.equals(id[j]) ) {
						id[j] = null;
						System.out.println("삭제 완료");
						break;
					}
				}
				break;
			}
			
		}
	}
}








