package abstract_;
/*	추상클래스 특징)
 *	1. abstract class 키워드로 추상클래스를 정의한다.
 *	2. 추상클래스는 new 키워드로 객체생성을 할 수 없다.
 *	3. 일반클래스에는 추상메서드가 올수 없다. 추상메서드는 
 *	4. abstract 키워드로 정의하고 {} 가 없고, 실행문장이 없다. 호출 불가능하다.
 */

abstract class AbsClass01{	// 추상클래스 정의
	abstract void pr(); //  pr()추상메서드 정의
}

class AbsClass02 { // 일반 클래스 정의
//	abstract void print();	// 일반클래스에는 추상메서드가 올수가 없다. 에러가남
}

public class AbsTest10 {
	public static void main(String[] args) {
//		AbsClass01 abs = new AbsClass01(); // 추상 클래스는 객체생성할수 없다. 에러남 
	}
}