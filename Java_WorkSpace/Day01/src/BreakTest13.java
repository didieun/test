// 부모클래스에서 정의한 멤버변수명과 자손클래스에서 정의한 멤버변수명이 동일한 경우 부모로 부터 상속 받은
// 멤버 변수명에 접근할 때는 super.멤버변수명; 으로 접근한다.

class Mother13 { // extends Object 이 생략됨
	protected int a = 10;
	protected int b = 20;
} // 부모클래스 Mother13 class

class Chiled13 extends Mother13 {
	protected int a = 40;
	protected int b = 50;
	protected int c = 30;
	
	public void pr01() {
		System.out.println("a: " + this.a + ", b: " + b + ", c: " + c); // this. 은 생략 가능함. 40, 50, 30
	}
	
	public void pr02() {
		System.out.println("super.a: " + super.a + ", super.b: " + super.b + ", this.c: " + this.c); // 10, 20, 30
	}
} // 자식클래스 Child13 class

public class BreakTest13 {
	public static void main(String[] args) {
		Chiled13 ch13 = new Chiled13();
		ch13.pr01();
		ch13.pr02();
		
	}
}