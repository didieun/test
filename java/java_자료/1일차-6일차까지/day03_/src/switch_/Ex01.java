package switch_;
/*
 f11 : 디버깅 시작 모드
 f6 : 한줄 실행( 무조건 )
 f5 : 한줄 실행( 메소드 이동 )
 f8 : 다음 브레이크 포인터 이동
*/
public class Ex01 {
	public static void main(String[] args) {
		int select = 1;
		switch ( select ) {
			case 1: System.out.println("1입력");	break;
			case 2:	System.out.println("2입력"); break;
			default: System.out.println("그 외의 값 입력");
		}
		System.out.println("다음 문장들 실행!!!");
		
		if(select == 1 ) System.out.println(1);
		else if (select == 2 )System.out.println(2);
		else System.out.println("그외");
		
		char ch = 'A';
		switch ( ch ) {
			case 'a':	//System.out.println("a입력");	break;
			case 'A':	System.out.println("A입력"); break;
			default: System.out.println("그 외의 값 입력");
		}
		//if( ch == 'a' || ch == 'A' )
		if(ch == 'a' ) System.out.println(1);
		else if (ch == 'A' )System.out.println(2);
		else System.out.println("그외");
	}
}









