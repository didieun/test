package method_;

import java.util.ArrayList;
class TestClass01{
	public void sumFunc() {
		System.out.println("매개변수 없는 sumFunc");
	}
	public void sumFunc( int num ) {
		System.out.println(num + " : int sumFunc");
	}
	public void sumFunc( int num , int n2 ) {
		System.out.println(num + n2 + " : int sumFunc");
	}
	public void sumFunc( String num , int n2 ) {
		System.out.println(num + n2 + " : int sumFunc");
	}
}
public class Ex01 {
	public static void main(String[] args) {
		TestClass01 t = new TestClass01();
		t.sumFunc();
		t.sumFunc( 100 );
		t.sumFunc(123, 456);
		t.sumFunc("안녕하세요", 456);
	}
}







