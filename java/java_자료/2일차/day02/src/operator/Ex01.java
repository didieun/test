package operator;
public class Ex01 {
	public static void main(String[] args) {
		System.out.println("==== 삼항 연산자 ====");
		int su1 = 20, su2 = 10;
		String str = ( su1 < su2 )?"su1이 su2보다 크다":
									"su2가 su1보다 크다";
		System.out.println( str );
		
		
		System.out.println("==== 증감 연산자 ====");
		int number1 = 5, number2 = 5;
		
		number1++; // 비슷 : number = number + 1
		System.out.println(number1);
		++number2;
		System.out.println(number2);
		
		number1 = 10;
		// 모든 연산이 끝난 후 자기 자신을 증가
		number2 = number1++;
		System.out.println("n1 : "+number1);
		System.out.println("n2 : "+number2);
		
		number1 = 10;
		// 자기 자신을 먼저 증가 후 연산
		number2 = ++number1;
		System.out.println("n1 : "+number1);
		System.out.println("n2 : "+number2);
		
		
		System.out.println("==== 논리 연산자 ====");
		int n3=10, n4=5, n5=7;
		System.out.println( n4 > n5 &&  n4 > n3 );
		System.out.println( n5 > n4 &&  n5 > n3 );
		System.out.println( n3 > n5 &&  n3 > n4 );
		
		System.out.println("---- or ----");
		System.out.println( true  || true );
		System.out.println( true  || false );
		System.out.println( false || true );
		System.out.println( false || false );
		
		System.out.println("---- and ----");
		System.out.println( true  && true );
		System.out.println( true  && false );
		System.out.println( false && true );
		System.out.println( false && false );
		
		System.out.println("---- not ----");
		System.out.println( !(false && true) );
		System.out.println( !false );
		
		System.out.println("==== 관계 연산자 ====");
		int num1=5, num2=4;
		System.out.println( num1 >  num2 );
		System.out.println( num1 <= num2 );
		System.out.println( num1 == num2 );
		System.out.println( num1 != num2 );
		
		
		System.out.println("==== 복합 연산자 ====");
		int s1, s2;
		s1 = s2 = 5;
		s1 += 1; // s1(6) = s1 5 + 1
		System.out.println(s1);
		s1 -= 1;  // s1(5) = s1(6) - 1
		System.out.println(s1);
		s1 *= s2;  // s1(25) = s1(5) * (5)s2
		System.out.println(s1);
		s1 /= s2;  // s1(5) = s1(25) / (5)s2
		System.out.println(s1);
		s1 %= s2;  // s1(0) = s1(5) % (5)s2
		System.out.println(s1);
		
		System.out.println("==== 산술 연산자 ====");
		int n1 = 9 , n2 = 2;
		System.out.println( n1 / n2 );
		System.out.println( n1 / (double)n2 );
		System.out.println( n1 % n2 );
	}
}
