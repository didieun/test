package variable;

public class TestClass01 {

	public String name = "홍길동";   // 인스턴스 변수(객체를 생성해야지 사용가능)
	
	public void test3() {
		System.out.println("test3: " + name);
		name = "변경";
	}
	
	public void test4() {
		System.out.println("test4: " + name);
	}
	
	public void test1() {
		int var = 100; // 지역변수 
		System.out.println("test1: " + var);
		test2(var);
	}
	
	public void test2(int var) {
		
		System.out.println("test2: " + var);
		
	}
}
