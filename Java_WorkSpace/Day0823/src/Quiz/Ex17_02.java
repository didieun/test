package Quiz;
// 17장.레퍼런스 형 변환.pdf 파일에서 No.20쪽 3번 문제
// - 업캐스팅 이후 오버라이딩 한 메서드 호출에 관한 문제이다.

class Super { // extends Object
	public int getNumber(int k) {
		return k + 1;
	} 
} // 부모 클래스

class CastingEx03 extends Super {
	@Override
	public int getNumber(int k) {
		return k + 2;
	}
} // 자손 클래스

public class Ex17_02 {
	public static void main(String[] args) {
		Super s = new CastingEx03(); // 업캐스팅
		int a = s.getNumber(1); // 3 -> 업캐스팅 이후 오버라이딩 한 메서드를 호출한다.
		System.out.println(a);
	}
}