package constructor;

class TestClass01{
	
	private String officeName;
	
	// 생성자는 반환타입이 없이 public 클래스명(){} 만 작성
	public TestClass01(){
		System.out.println("기본 생성자");
	}
	
	public TestClass01(String officeName) {
		System.out.println(officeName + ": 매개변수 있는 생성자");
		this.officeName = officeName;
	}
	
	public String getOfficeName() {
		return officeName;
	}
}

public class MainClass01 {

	public static void main(String[] args) {
		
		TestClass01 t = new TestClass01();
		
		String msg = "나의회사";
		TestClass01 t02 = new TestClass01(msg);
		
		System.out.println("main: " + t.getOfficeName());
		System.out.println("main: " + t02.getOfficeName());

	}

}
