/*
 * 	부모클래스 생성자가 오버로딩이 된경우 기본생성자 묵시적 제공을 하지 않는다. 이럴때 자손에서 부모의 기본생성자를
 * 	호출할려면 에러가 발행한다.
 */

class Mother15 {
	protected int a = 100;
	protected int b = 200;
	
	public Mother15(int a, int b) {
		this.a = a;
		this.b = b;
	} // 전달인자 개수가 다른 생성자 오버로딩
}

class Son15 extends Mother15 {
	protected int c = 300;
	
	public Son15 () {
		// super(); // 생략됨. 부모클래스 기본생성자를 호출할려다가 컴파일 에러가 난다.
		super(100, 200);
		System.out.println("자손의 Son15() 기본생성자 호출");
	}
	
	// 문제) 합리적인 생성자 오버로딩 추가 코드를 해보자. 참고로 a,b,c 멤버변수값이 1000,2000,3000으로 변경 되는 코드다.
	public Son15 (int a, int b, int c) {
		super(a, b); // 부모클래스 전달인자 2개짜리 오버로딩 된 생성자를 호출
		this.c = c;
	}
	
	public void print() {
		System.out.println("a:" + a + ", b:" + b + ", this.c:" + this.c);
	}
}

public class BreakTest15 {
	public static void main(String[] args) {
		Son15 s15 = new Son15(); // new Son15(); 에 의해서 Son15()기본생성자 호출
		s15.print();
		Son15 s16 = new Son15(1000, 2000, 3000); // 전달 인자 3개짜리 오버로딩 된 생성자를 호출
		s16.print();
	}
}