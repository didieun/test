package abstract_;
/* 
 *	추상클래스를 상속받은 일반 자손클래스에서는 반드시 부모 추상클래스의 추상메서드를 오버라이딩을 해야 한다. 
 *	그래야만 자손클래스 객체 생성이 가능하다.
 */

abstract class Father11 {
	abstract void m01();	// 추상메서드 정의
	
	void m02() {
		System.out.println("일반메서드 m02");
	}
}

class Son11 extends Father11 {
	@Override
	void m01() {
		System.out.println("m01추상메서드 오버라이딩");
	}
}

public class AbsTest11 {
	public static void main(String[] args) {
		Father11 f = new Son11(); // 업캐스팅
		f.m01(); // 업캐스팅 이후 오버라이딩 한 메서드 호출
		
		// 자식클래스로 객체 생성후 호출
		Son11 s = new Son11();
		s.m01();
		s.m02(); // 상속받아서 호출 
	}
}