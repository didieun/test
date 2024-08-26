package downcasting;
/*
 *	다운캐스팅이란(DownCasting)이란?
 *	1. 상속관계에서 부모타입의 참조변수가 자손타입의 참조변수로 변환하는 것을 말한다. 부모클래스가 자손클래스로 형변환이 이루어지는 것을 말한다.
 *	2. 참조타입간의 다운캐스팅 전제조건
 *		가. 사전에 상속관계를 만들어야 한다.
 *		나. 자바 컴파일러에 의해서 자동형변환을 해주지 않는다. 그러므로 캐스팅(형변환) 연산자를 사용해서 명시적인 다운캐스팅을 해야 한다.
 *		다. 사전에 반드시 업캐스팅을 해야한다. 그래야만 다운캐스팅을 허용한다. (제일 중요!!)
 */

class Parent02 {
	void pr02() {
		System.out.println("부모클래스 메서드 pr02()");
	}
}

class Child02 extends Parent02 {
	void ch02() {
		System.out.println("자손클래스 메서드 ch02()");
	}
}

public class DownCast02 {
	public static void main(String[] args) {
		Parent02 p = new Child02();
		p.pr02();
//		p.ch02()	// 컴파일 에러. 업캐스팅 하면 자손클래스의 메서드는 사용할수 없음!!( 부모꺼만 사용가능)
		Child02 ch;
		ch = (Child02)p; 	// 명시적인 다운캐스팅
		ch.pr02();	// 상속받아서 호출
		ch.ch02();	// 자손에서 정의된 메서드 호출
	}
}