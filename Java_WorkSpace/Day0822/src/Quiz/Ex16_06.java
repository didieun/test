package Quiz;
//16장.상속.pdf 강의교안의 28쪽 5번문제 - 에러가 나는 문제
// 부모클래스 생성자가 오버로딩이 되면 매개변수가 없는 기본생성자를 묵시적으로 제공하지 않는다.
// 이런경우 자손클래스에서 부모의 기본생성자를 호출할려다가 에러가 발생한다.

class TestSuper extends Object {
	
//	TestSuper(int i){
//		// super(); 가 생략되었다. 부모의 Object 클래스 기본생성자를 호출
//	}// 생성자 오버로
	
} // TestSuper 부모 클래스

class TestSub extends TestSuper {
	TestSub() {
		super(); // 생략 가능함.
	}
	
}// 자손클래스 TestSub

public class Ex16_06 {
	public static void main(String[] args) {
		new TestSub(); // 자손의 기본생성자 호출
	}
}
