package constructor;

import java.util.ArrayList;

class TestClass02{
	
	// 디폴트 생성자를 사용 안하더라도 만들어야됨.
	public TestClass02() {}
	
	public TestClass02(int num) {
		System.out.println(num + ": 생성자");
	}
	
}

public class MainClass02 {

	public static void main(String[] args) {
		
		TestClass02 t = new TestClass02(12345);
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add(null);

	}

}
