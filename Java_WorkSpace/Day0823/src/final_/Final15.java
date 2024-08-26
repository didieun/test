package final_;
// 클래스를 final 로 선언하면 더이상 상속을 허락하지 않는다.

final class FinalClass {
	int k = 10;
	
	public void setK(int k) {
		this.k = k;
	}
	
	public void print() {
		System.out.println("k: " + k);
	}
}

class FinalSon15 extends FinalClass { // final 클래스는 상속이 안된다.
	int b = 20;
	
	public FinalSon15() {
		this.b = 200;
	}
	
	public void pr() {
		System.out.println("b: " + b);
	}
}

public class Final15 {
	public static void main(String[] args) {
		
	}
}