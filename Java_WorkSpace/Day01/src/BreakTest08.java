//	static 키워드로 정의된 정적메서드 내에서는 this와 인스턴스 변수를 사용할 수 없다.

class St08{
	static int a=10; // 정적변수
	int b = 20; // 인스턴스 변수
	
	public static void printA() {	// static 키워드로 정의된 정적메서드. 정적메서드(클래스 메서드)는 해당 클래스명으로 직접 접근한다.
//		System.out.println(this.b);	// 정적메서드 내에서는 this 를 사용하지 못한다.
//		System.out.println(b);	// 정적메서드 내에서는 인스턴스 변수를 사용할 수 없다.	
		System.out.println(a);
	}
	
	public void printB() {
		System.out.println(this.b);
		System.out.println(b);
		System.out.println(a);
	}
}

public class BreakTest08 {

	public static void main(String[] args) {
		
	}

}