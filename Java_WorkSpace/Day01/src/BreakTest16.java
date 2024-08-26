// 상속관계에서 부모클래스 생성자가 오버로딩이 된 경우 자손에서 생성자 호출에 관한 소스
class Mother16 { // extends Object 이 생략되었다.
	protected int a = 10;
	protected int b= 20;

	// 생성자가 오버로딩이 ㅇ되면 묵시적인 기본생성자를 제공하지 않는다.
	
	public Mother16(int a, int b) {
		// super(); 코드가 생략됨. 최상위 부모클래스 Object 의 기본생성자를 호출
		this.a = a;
		this.b = b;
	}
}// Mother16 class

class Son16 extends Mother16 {
	protected int c = 30;
	
	public Son16() {
		super(100, 200); // 부모클래스 전달인자 2개짜리 오버로딩 된 생성자를 호출한다.
		this.c = 300;
	}
	
	public Son16(int a, int b, int c) {
		super(a, b);
		this.c = c;
	} // 전달인자 3개짜리 오버로딩 된 생성자 
	
	public void pr() {
		System.out.println("a:" + a + ", b:" + b + ", this.c:" + this.c);
	}
}

public class BreakTest16 {
	public static void main(String[] args) {
		Son16 s16 = new Son16();
		s16.pr();
		Son16 s17 = new Son16(1000, 2000, 3000);
		s17.pr();
	}
}