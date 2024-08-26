package upcasting;
/* 	업캐스팅(UpCasting)이란?
 *	1. 상속관계에서 자손타입 참조변수가 부모타입 참조변수로 변환하는 것을 말한다. 자손클래스가 부모클래스로 형변환이 이루어 지는 것을 의미한다.
 *	2. 업캐스팅은 자바 컴파일러에 의해서 자동형 변환을 해준다.
 */

class Parent01 { // extends Object 이 생략됨.
	void parentPrn() {
		System.out.println("부모클래스 메서드 parentPrn()");
	}
}

class Child01 extends Parent01{
	void childPrn() {
		System.out.println("자손클래스 메서드 childPrn()");
	}
}

public class Upcast01 {
	public static void main(String[] args) {
		Child01 c = new Child01();
		c.parentPrn();
		c.childPrn();
		
		//Parent01 p1;
		//p1 = c;
		//p1.parentPrn(); // 아래와 같이 작성 할수도 있음.
		
		Parent01 p = new Child01(); // 업캐스팅, 자동형 변환
		p.parentPrn();
//		p.childPrn();  // 업캐스팅을 하면 자식에 있는 메서드를 호출할수 없음.  컴파일 에러가 남 
	
	}
}