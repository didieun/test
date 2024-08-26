package Quiz;
//16장.상속.pdf 강의교안의 29쪽 6번문제
// new 클래스명();에 의해서 호출되는 생성자 관한 소스

class Base extends Object{
	Base() {
		super();
		System.out.print("Base");
	}
}// Base 부모클래스

class Alpha extends Base{
	// 묵시적인 기본생성자 생략
}// Alpha 자손클래스

public class Ex16_07 {
	public static void main(String[] args) {
		new Alpha();
		new Base();
	}
}
