package method_;
class Test{
	public void 입력() {
		System.out.println("입력");
		연산();
	}
	public void 연산() {
		System.out.println("연산");
		출력();
	}
	public void 출력() {
		System.out.println("출력");
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Test t = new Test();
		t.입력();
	}
}







