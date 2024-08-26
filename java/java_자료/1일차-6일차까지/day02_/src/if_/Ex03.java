package if_;

public class Ex03 {
	public static void main(String[] args) {
		int num = 11;
		if( num == 10 ) {
			System.out.println("if 실행");
		}else {
			System.out.println("else");
		}
		System.out.println("다음 문장들 실행");
		
		int n1, n2 = 10;
		if( n2 > 100 )
			n1 = 100;
		else
			n1 = 1234;
		System.out.println( n1 );
		
		//n2 = n1 + 10;
		//System.out.println( n1 );
		
		int i = 0;
		double d = 0;
		char ch = 0;
		
		String s = null;
		
		int n = 10;
		if( n % 2 == 0 && n % 3 == 0) {
			System.out.println("짝 3배수");
		}else {
			System.out.println("아님");
		}
		
		if( n % 2 == 0 ) {
			System.out.println("짝수다");
			if( n % 3 == 0) {
				System.out.println("3의 배수");
			}else {
				System.out.println("배수 아님");
			}
		}else {
			System.out.println("짝수가 아니다");
			if( n % 3 == 0) {
				System.out.println("3의 배수");
			}else {
				System.out.println("배수 아님");
			}
		}
	}
}














