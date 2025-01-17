package Quiz;
//16장.상속.pdf 강의교안의 21쪽 2번문제

class Parent3 {
	protected int a, b, c;
	
	public Parent3() {
		super(); // 부모Object클래스 기본생성자 호출
		System.out.println("Parent3() 기본생성자 호출");
	}
	
	public Parent3(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println("Parent3() 오버로딩 된 생성자 호출");
	}
} //Parent3 class

class Child3 extends Parent3 {
	
	public Child3() {
		// super(); 이 생략됨.
		System.out.println("Child3() 기본생성자 호출");
	}
	public Child3(int a, int b, int c) {
		super(a, b, c); // 부모 클래스 오버로딩 된 생성자를 호출하는 부분은 항상 첫줄에 와야 한다.
		System.out.println("Child3() 오버로딩 된 생성자 호출");
	}
	
	public String print() {
		String result = "a: " + a + ", b: " + b + ", c: " + c;
		
		return result;
	}
}

public class Ex16_03 {
	public static void main(String[] args) {
		new Child3();
		Child3 three = new Child3(100, 200, 300);
		
		// 문제) 메서드 리턴타입이 String 으로 된 print()메서드를 정의한 다음 a,b,c 멤버변수 정수값을
		// 문자열 변수 result 저장한 다음 반환해서 출력하는 코드를 만들어 보자.
		String result = three.print();
		System.out.println("result: " + result);
	}
}