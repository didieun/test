package set_get;
class Test01{
	public int num = 12345;
	public void test() {
		int num = 10000;
		System.out.println("this : " + this.num );
		System.out.println("test : "+num);
		this.test2();
	}
	public void test2() {
		System.out.println("test2실행");
	}
}
public class Ex01 {
	public static void main(String[] args) {
		Test01 t = new Test01();
		System.out.println( t );
		t.test();
		t.num = 1000;
		//t.test2();
	}
}






