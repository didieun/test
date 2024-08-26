package Quiz;
// 17장.레퍼런스 형 변환.pdf 파일에서 No.19쪽 2번 문제

class SubClass { // extends Object
	int i = 3;
	void print() {
		System.out.println("i: " + i);
	}
}

public class Ex17_01 {
	public static void main(String[] args) {
		Object obj = new SubClass(); // 업캐스팅
		
		// 문제) 형변환유무 판단 연산자와 if 조건문을 사용해서 다운캐스팅이 가능할때만 형변환되게 추가 코드를 해보자
		// subClass에 사용자 정의 메서드 void print(){}를 정의해서 i 멤버변수값을 출력해 보자.
		if(obj instanceof SubClass) {	// 다운캐스팅이 가능한가?
			SubClass sub = (SubClass)obj;	// 명시적인 다운캐스팅
			sub.print();
		}
	}
}