package variable;

public class MainClass01 {

	public static void main(String[] args) {
		
//		String name = "홍길동";
//		
//		if(true) {
//			String n = "김길이"; // if 문안에서만 사용하는 지역변수!
//			System.out.println(name);
//			name = "김개똥";
//		}
//		System.out.println(n); //오류남
//		System.out.println("밖: " + name);

		TestClass01 t = new TestClass01();
		t.test1();
		t.test3();
		t.test4();
		
		System.out.println(t.name); // class 필드 불러오기
	}

}
