package upcasting;
// 업캐스팅 이후 오버라이딩 한 메서드 호출에 관한 소스이다.
class Parent09 {
	int x = 100;
	
	void method() {
		System.out.println("부모클래스에서 정의한 인스턴스변수 x = " + x);
	}
}

class Son09 extends Parent09 {
	@Override
	void method() {
		System.out.println("오버라이딩한 메서드");
	}
}

public class UpcastOverride09 {
	public static void main(String[] args) {
		Parent09 p = new Son09();

		// 메서드가 오버라이딩이 된 경우에 업캐스팅한 p 가 실제 호출되는 메서드는 p 가 가르키고 실체객체타입에 의해서 호출되는 메서드가 결정된다.
		// 결국 업캐스팅 이후 오버라이딩 한 메서드를 호출한다.
		p.method(); // 사용빈도가 높다. 중요하다!!!
	}
}