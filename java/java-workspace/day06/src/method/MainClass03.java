package method;

public class MainClass03 {

	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
		
		System.out.println("main 시작");
		t.test();
		System.out.println("main 종료");
		
		t.sumFunc();
		// 위의 메소드는 하나의 메소드에 입력, 연산, 출력이 다있음..
		// 되도록 입력, 연산, 출력을 다 따로따로 만드는것이 좋음
	}

}
