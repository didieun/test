package day08_;

import java.util.Scanner;

public class Login {
	private String id, pwd;

	public void display() {
		String inputId=null, inputPwd=null;
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("1.로그인");
			System.out.println("2.가입");
			System.out.println("3.종료");
			System.out.print(">>> : ");
			int num = input.nextInt();
			switch (num) {
			case 1:
				System.out.println("로그인 아이디 입력");
				inputId = input.next();
				System.out.println("로그인 비번 입력");
				inputPwd = input.next();
				
				int result = loginCheck(inputId, inputPwd);
				if(result == 0) {
					System.out.println("당신은 로그인 성공 사용자 입니다");
				}else {
					System.out.println("당신은실패!!!!");
				}
				break;
			case 2:
				System.out.println("가입 아이디 입력");
				inputId = input.next();
				System.out.println("가입 비번 입력");
				inputPwd = input.next();
				id = inputId;
				this.pwd = inputPwd;
				System.out.println("가입 완료");
				break;
			case 3:break;
			}
		}
	}

	public int loginCheck(String inputId , String inputPwd) {
		if( inputId.equals( this.id ) &&
				inputPwd.equals(pwd) ) {
			//System.out.println("인증 통과");
			return 0;
		}else {
			//System.out.println("인증 실패");
			return 1;
		}
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
