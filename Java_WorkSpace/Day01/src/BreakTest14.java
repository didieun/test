// 상속에서 생성자 호출에 관한 부분
class Mother14 extends Object {
	protected int x = 10;
	protected int y = 20;
	
	public Mother14() {	// 생성자 명은 클래스 명과 같게 만든다.
		super(); // 최상위 부모클래스 Object 의 기본생성자를 먼저 호출한다. 물론 생략 가능하다.
		System.out.println("부모클래스 Mother14() 기본생성자 호출");
	} // 매개변수가 없는 기본생성자
}

class Son14 extends Mother14 {
	protected int z = 30;
	
	public Son14() {
//		super(); // 생략됨 => 부모의 Mother14(){} 기본생성자를 먼저 호출
		System.out.println("자손클래스 Son14() 기본생성자 호출");
	}
	
	public void pr() {
		System.out.println("x:" + x + ", y:" + y + ", z:" + z); // x, y 는 상속 받아서 호출
	}
}

public class BreakTest14 {

	public static void main(String[] args) {
//		Son14 son = new Son14();
//		son.pr();
		
		// 위에 코드를 아래와 같이 작성 할수있다. 
		new Son14().pr(); // new Son14()에 의해서 기본 생성자를 호출
	}
}