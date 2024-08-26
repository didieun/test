package Quiz;
//16장.상속.pdf 강의교안의 32쪽 9번문제
// 상속관계에서 메서드 오버라이딩 super.메서드()에 관한 소스

class A2{
	public String toString() {
		return "4";
	}
}// A2 class 부모 메서드

class B2 extends A2 {
	@Override
	public String toString() {
		return super.toString() + "3";
	}// 메서드 오버라이딩
}// B2 class 자식 메서드 

public class SubEx09 {
	public static void main(String[] args) {
		System.out.println(new B2()); // new B2().toString() 즉 .toString()메서드가 생략됨.
	}
}
