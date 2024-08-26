package set_get;

class Test02 {
	
	private int num = 1234;
	// private -> 외부의 접근 막는다. class 내부에서만 접근한다. (은닉화)
	private String name;
	
	// 값을 설정 setter
	public void setName(String name) {
		this.name = name;
	}
	
	// 값을 내보내는 설정 getter
	public String getName() {
		return name;
	}
	
	// 값을 설정 setter
	public void setting(int num) {
		this.num = num;
	}
	
	// 값을 내보내는 설정 getter
	public int getter() {
		return num;
	}
	
}

class Test_02 {
	
	private int num ; // 은닉화 
	private String name; // 은닉화 
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		
		Test02 t = new Test02();
		t.setting(100);
		System.out.println(t.getter());
		
		t.setName("홍길동");
		String s = t.getName();
		System.out.println("당신 이름: " + s);
		
		System.out.println("---------------------");
		Test_02 t02 = new Test_02();
		t02.setNum(12345);
		System.out.println(t02.getNum());
		System.out.println("---------------------");
		t02.setName("홍길동");
		String str = t02.getName();
		System.out.println(str);
		
	}

}
