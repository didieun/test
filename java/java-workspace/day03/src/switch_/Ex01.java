package switch_;

public class Ex01 {

	public static void main(String[] args) {
		
		// switch - case 문
		int select = 1;
		
		switch(select) {
			case 1 : System.out.println("1입력"); break;
			case 2 : System.out.println("2입력"); break;
			default : System.out.println("그 외의 값 입력");
		}
		// break; 입력을 안하면 다음 문장으로 이동하게됨(모든값 출력). break; 입력하여 switch 문을 빠져나감.
		
		System.out.println("다음 문장들 실행!!");

		
		// 위의 switch 문을 if 문으로 작성할려면
		if(select == 1) {
			System.out.println("1입력");
		} else if(select == 2) {
			System.out.println("2입력");
		} else {
			System.out.println("그 외의 값 입력");
		}
		
		char ch = 'a';
		
		// 특수한 경우 -> 소문자, 대문자 구분없이 사용할려면 break 안써도 됨.
		switch(ch) {
			case 'a' : //System.out.println("a입력"); break;
			case 'A' : System.out.println("A입력"); break;
		}
		
		// if(ch == 'a' || ch == 'A') -> 이렇게 작성하면 대소문자 상관없이 문자 출력
		if(ch == 'a')	System.out.println("a 입력");
		else if(ch == 'A') System.out.println("A 입력");
		else System.out.println("그 외의 값 입력");
		
		// 디버깅 -> 디버깅을 할려면 완성된 코드가 있어야되고 에러가 없으면 디버깅을 할수 있다.
		// 코드 내에서 버그(에러)를 찾아내기 위한 테스트 과정
		
		// 윈도우 단축 
		// f11 : 디버깅 시작 모드
		// f6 : 한줄 실행(무조건)
		// f5 : 한줄 실행 (메소드 이동)
		// f8 : 다음 브레이크 포인터 이동
		
		// 맥
		// fn + Command(⌘) + F11 :  디버깅 시작 모드
		// fn + Command(⌘) + F2 : 디버깅 종료 -  디버깅 체크포인트 더블클릭으로 제거한뒤 해야 디버깅 시작이 안됨 
		// fn + f6 : 한줄 실행(무조건)
		// fn + f5 : 한줄 실행 (메소드 이동)
		// fn + f8 : 다음 브레이크 포인터 이동
		
	}

}
