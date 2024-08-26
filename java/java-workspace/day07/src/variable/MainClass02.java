package variable;

class AAA{
	
	public static String path = "c:/test폴더/java";
	// class 들 끼리 공유하는 변수는 클래스 변수로 사용
	// 클래스 내부에서는 인스턴스 변수 사용.
	
	public void 저장소역할() {
		System.out.println("내용을 "+ path + "에 저장합니다.");
	}
	
}

class BBB{
	
	public void 가져오기() {
		
		System.out.println("내용을 " + AAA.path + "에 가져옵니다.");
	}

}

public class MainClass02 {

	public static void main(String[] args) {

		System.out.println(TestClass02.n2);
		// 클래스 변수 -> 객체를 만들지 않더라도 사용이 가능하다. 
		
		AAA a = new AAA();
		a.저장소역할();
		
		BBB b = new BBB();
		b.가져오기();
		
	}

}
