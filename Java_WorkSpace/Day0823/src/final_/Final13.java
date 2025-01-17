package final_;
// 변수를 final 로 선언하면 수정할 수 없는 상수가 된다.
// 상수명은 관례적으로 영문대문자로 한다.

class FinalMember {
	final int ABC = 100;
	
	public void setAbc(int abc) {
//		this.ABC = abc; // 컴파일 에러가 남 상수는 값을 변경할수가 없음
	}
	
	public void pr() {
		System.out.println("ABC상수값: " + ABC);
	}
}

public class Final13 {
	public static void main(String[] args) {
		FinalMember fm = new FinalMember();
		fm.setAbc(1000);
		fm.pr();
	}
}