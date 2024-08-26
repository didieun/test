package method;

public class MainClass01 {

	public static void main(String[] args) {
		
		TestClass01 t = new TestClass01();
		
		// .(도트) : 멤버 접근 연산자!
		t.name = "김길이";
		t.age = 20;
		
		System.out.println(t.name);
		System.out.println(t.age);
		

	}

}
