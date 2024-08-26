package method;

import member.MemberClass;

public class Ex01 {

	public static void main(String[] args) {
		
		MemberClass mc = new MemberClass();
		// class 로 변수를 만드는걸 객체라고한다.
		
		mc.name = "홍길동";
		mc.age = 20;
		
		System.out.println(mc.name);
		System.out.println(mc.age);
		
	}

}
