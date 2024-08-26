package set_get;
import java.util.Scanner;
public class QuizMain03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		QuizSetGet03 q = new QuizSetGet03();
		String id = null, pwd = null;
		int num;
		while(true) {
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.종료");
			System.out.print(">>> : ");
			num = input.nextInt();
			switch (num) {
			case 1:
				System.out.println("로그인 아이디 입력");
				id = input.next();
				System.out.println("로그인 비밀번호 입력");
				pwd = input.next();
				if( id.equals( q.getId()) ) {
					if( pwd.equals( q.getPwd()) ) {
						System.out.println("인증 통과");
					}else {
						System.out.println("비밀번호 틀림!!!");
					}
				}else {
					System.out.println("존재하지 않는 id 입니다");
				}
				break;
			case 2:
				System.out.println("회원 가입 id 입력");
				id = input.next();
				q.setId(id);
				System.out.println("회원 가입 pwd 입력");
				q.setPwd( input.next() );
				System.out.println("등록 완료!!!");
				break;
			case 3:
				System.out.println("프로그램 종료");
				return ;
			}
		}
	}
}
