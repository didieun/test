package operator;

public class Ex01 {

	public static void main(String[] args) {
		
		System.out.println("========== 산술 연산자 ==========");
		int n1 = 9, n2 = 2;
		System.out.println(n1 / n2);
		System.out.println(n1 / (double)n2);
		// 앞에 값이 실수이거나 뒤에 값이 실수이거나 둘다 실수값이면 결과는 실수값으로 나온다.
		System.out.println(n1 % n2);
		
		System.out.println("========== 복합 대입 연산자 ==========");
		int s1, s2;
		s1 = s2 = 5;
		s1 += 1;
		System.out.println(s1); // 6
		
		s1 -= 1;
		System.out.println(s1); // 5
		
		s1 *= s2;
		System.out.println(s1); //25
		
		s1 /= s2;
		System.out.println(s1); //5
		
		s1 %= s2;
		System.out.println(s1); //0
		
		System.out.println("========== 관계 연산자 ==========");
		int num1 = 5, num2 = 4;
		System.out.println(num1 > num2); // true
		System.out.println(num1 <= num2); // false
		System.out.println(num1 == num2); // false
		System.out.println(num1 != num2); // true
		
		System.out.println("========== 논리 연산자 ==========");
		int n3 = 10, n4 = 5, n5 = 7;
		System.out.println(n4 > n5 && n4 > n3); // false
		System.out.println(n5 > n4 && n5 > n3); // false
		System.out.println(n3 > n5 && n3 > n4); // true
		
		System.out.println("-------- or(||) ---------");
		System.out.println(true || true);	// true
		System.out.println(true || false);	// true
		System.out.println(false || true);	// true
		System.out.println(false || false);	// false
		
		System.out.println("-------- and(&&) ---------");
		System.out.println(true && true);	// true
		System.out.println(true && false);	// false
		System.out.println(false && true);	// false
		System.out.println(false && false);	// false
		
		System.out.println("-------- not(!) ---------");
		System.out.println(!(false && true));  // true
		System.out.println(!false);  // true
		
		System.out.println("========== 증감 연산자 ==========");
		int number1 =5, number2 = 5;
		
		number1++;	// 후치 : 연산 후 값을 1만큼 증가 
		System.out.println(number1); // 6
		++number2;	// 전치: 1만큼 증가 후 연산 
		System.out.println(number2); // 6
		
		number1 = 10;
		// 모든 연산이 끝난 후 자기 자신을 증가 (대입연산자를 먼저 증가한뒤 연산함 그러므로 number2 에 10을 주고 자기자신 number1은 증가가되어 11이 된다)
		number2 = number1++; 
		System.out.println("n1: " + number1);
		System.out.println("n2: " + number2);
		
		number1 = 10;
		// 자기 자신을 먼저 증가 후 연산 
		number2 = ++number1;
		System.out.println("n1: " + number1);
		System.out.println("n2: " + number2);
		
		System.out.println("========== 삼항 연산자 ==========");
		// 조건식에 따라 참인 경우 앞부분의 식을.. 것짓인경우 뒷부분을 수행..
		// 변수 = (조건식) ? 참인경우 : 거짓인 경우;
		
		int su1 = 20, su2 = 10;
		String str = (su1 > su2) ? "su1이 su2보다 크다" : "su2가 su1보다 크다";
	
		System.out.println(str);
		
	}

}
