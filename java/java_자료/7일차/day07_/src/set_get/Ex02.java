package set_get;
class Test_02{
	private int num;
	private String name;
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
class Test02{
	private int num = 1234;
	private String name;
	public void setName( String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void setting(int n) {
		num = n;
	}
	public int getter() {
		return num;
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Test_02 t02 = new Test_02();
		t02.setNum(12345);
		System.out.println( t02.getNum() );
		System.out.println("--------------------");
		
		
		Test02 t = new Test02();
		t.setting( 100 );
		System.out.println( t.getter() );
		
		t.setName("홍길동");
		String s = t.getName();
		System.out.println("당신 이름 : "+s);
	}
}













