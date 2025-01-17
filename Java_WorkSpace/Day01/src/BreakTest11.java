/*	
 *	메서드 오버라이딩 이란?
 * 	1. 상속관계에서 부모클래스 메서드 이름, 메서드명 앞의 리턴타입, 매개변수(전달인자) 
 * 	타입과 개수 모두 동일한 원형을 그대로 자손으로 상속받은 상태에서 {}중괄호 내의 본문 실행문장을 자손에 맞게 변경 수정하는 것을 메서드 오버라이딩 이라고 한다.
 * 
 * 	2. 오버라이딩을 하기 위해서는 사전에 반드시 상속관계를 만들어야 한다.
 */

class Parent11 {
	void p11() {
		System.out.println("부모클래스 메서드 p11()");
	}
}

class Child11 extends Parent11 {
	@Override
	void p11() {
		System.out.println("자손에 맞게 오버라이딩 한 메서드 p11()");
	}
}

public class BreakTest11 {

	public static void main(String[] args) {
		Parent11 parent = new Parent11();
		parent.p11();	// 부모 클래스 메서드 호출 
		
		Child11 child = new Child11();
		child.p11();	// 오버라이딩 한 메서드 호출
	}
}