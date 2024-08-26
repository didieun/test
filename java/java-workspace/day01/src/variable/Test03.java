package variable;

public class Test03 {

	public static void main(String[] args) {
		
		/*
		 형변환(type castion) : 자료형을 형 변환한다.
		 - 강제 형변환: 강제로 자료형을 변경
		 - 자동 형변환: 프로그램에서 자동으로 자료형 변경 
		 */
		
		int num = 0;
		char ch = 'A';
		System.out.println("변경 전 num: " + num);
		num = ch; // char type 에서 int type 으로 변경을 하면 자동형 변환
		System.out.println("변경 후 num: " + num);
//		ch = num;  // 에러가남. 이유는 int(4byte)가 char(2byte) 크기보다 크기때문에 강제 형변환을 해줘야됨.
		char ch2 = (char)num; // 강제 형변환
		System.out.println("ch2: " + ch2);
		System.out.println("ch2: " + (int)ch2);
		
		double dou = 1.123;   // double은 8바이트임.
		float fl = (float)1.234;    // float은 4바이트. (float)를 써줘야된다.
		float fl2 = 1.234f;    // 아니면 1.234 소수점 뒤에 f를 써준다.
		
		// ** 상수: 상수는 절대 변경되면 안되는 값! 변경할수 없게 final 키워드를 써준다.(해당하는 값이 한번 저장하면 다시는 변경할수 없다.)
		// 그래서 상수를 구분하기 위해서 변수를 전부 대문자로 써줘야된다.
		final String KOREA = "대한민국";
		System.out.println("변경 전: " + KOREA);
//		KOREA = "미국";
		System.out.println("변경 후: " + KOREA);
		

	}

}
