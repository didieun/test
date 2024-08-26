package set_get;

class Test01 {
	
	public int num = 12345;
	
	public void test() {
		
		int num = 10000;
		
		System.out.println("this: " + this);
		System.out.println("this.num: " + this.num); // this.를 붙여주면 class 의 변수( 밖에 있는 변수 )
		System.out.println("test: " + num); // 내 영역에 있는 변수(지역변수)
		
		test2(); 
		this.test2();
	}
	
	public void test2() {
		System.out.println("test2 실행");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		
		Test01 t = new Test01();
		System.out.println(t);
		// 패키지명.class명@위치정보 
		t.test();
//		t.test2();
			
	}

}
