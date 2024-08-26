package Quiz;
//16장.상속.pdf 강의교안의 31쪽 8번문제
// 항상 부모클래스 생성자를 호출할 때는 첫줄에서 해야 한다.

class A {
	public A() {
		super();
		System.out.println("hello from a");
	} //A() 기본 생성자
}

class B extends A{
	public B() {
		System.out.println("hell from b");
//		super(); // 부모클래스 생성자를 호출할 때는 반드시 첫줄에 와야 하는데 그렇지 못해서 에러가 발행
	}
}
public class Ex16_09 {
	public static void main(String[] args) {
		A a = new B();
	}
}
