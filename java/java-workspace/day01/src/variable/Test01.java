package variable;

public class Test01 {

	public static void main(String[] args) {
		
		// int -> 4byte 정수값 정수 자료형 
		int age = 30;
		// 오른쪽에 있는 결과값을 왼쪽 변수명에 저장하겠다.
		
		//double -> 8byte 실수값 정수 자료형 
//		double weight = 55.0;
//		double height = 100.123;
		
		// 같은 자료형이면 , 콤마로 같이 쓸수가 있다.
		double weight = 55.0, height = 100.123;
		
		System.out.println("나의 나이는 " + age + "살 입니다.");
		System.out.println("나의 몸무게: " + weight + "kg"); 
		
		// 자료형은 변수를 처음만들때만 써주고 변수를 변경하면 자료형은 안써줘도 된다.
		age = 123;
		
		System.out.println("변경 후 " + age + "살 입니다.");
		System.out.println("나의 키: " + height + "cm"); 
		
		System.out.println();
		
		int number = 123;
		System.out.println("변경 전: " + number);
		number = 100;
		System.out.println("변경 후: " + number);
		number = number + 300;
		System.out.println("변경 후: " + number);

	}

}
