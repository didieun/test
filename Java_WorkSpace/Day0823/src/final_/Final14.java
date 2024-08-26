package final_;
// 메서드를 final 로ㅗ 선언하면 더이상 자손에서 오버라이딩을 허락하지 않는다.

class FinalMethod14 {
	public final void pr() {
		System.out.println("파이널 메서드이다.");
	}
}

class Son14 extends FinalMethod14 {
//	@Override
//	public final void pr() {
//		System.out.println("pr()메서드는 final이라서 오버라이딩이 안된다.");
//	}
}

public class Final14 {
	public static void main(String[] args) {
		FinalMethod14 fm = new Son14(); // 업캐스팅
		fm.pr(); // 업캐스팅 이후 오버라이딩 된 메서드 호출. 에러남 final 메서드는 오버라이딩이 안된다.
	}
}