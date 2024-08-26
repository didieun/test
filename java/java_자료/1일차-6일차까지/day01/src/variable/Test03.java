package variable;

public class Test03 {
	public static void main(String[] args) {
		/*
		 형변환 ( type casting ) 
		 - 강제 형변환 : 강제로 자료형을 변경
		 - 자동 형변환 : 프로그램에서 자동으로 자료형 변경
		 */
		int num = 0;
		char ch = 'A';
		System.out.println("변경 전 num : "+num);
		num = ch;//자동형 변환
		System.out.println("변경 후 num : "+num);
		//ch = num;
		char ch2 = (char)num;
		System.out.println("ch2 : " + ch2 );
		System.out.println("ch2 : " + (int)ch2 );
		
		double dou = 1.123;
		float fl = (float)1.234;
		float fl2 = 1.234f;
		
		final String KOREA = "대한민국";
		System.out.println("변경 전 : "+KOREA);
		//korea = "미국";
		System.out.println("변경 후 : "+KOREA);
	}
}








