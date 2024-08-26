package method;

class TestClass07 {
	
	public void test1() {
		
		int num = 1;
		if(num == 1) {
			System.out.println(111);
			return;
			// return 은 반환값을 돌려주는것도 있지만, 메소드를 종료하는 기능도 있다.
		}
		System.out.println("다음 문장실행");
	}
	
	public String test2() {
		
		int num = 1; 
		if(num == 1 ) {
			return "성공";
		} else {
			// 첫 문자가 소문자인 자료형일 경우 return 0; 첫 문자가 대문자인 자료형일 경우 return null;
			return null; // if 문을 사용할때 아닐경우도 있기때문에 마지막에 return 으로 아무것도 없는 값을넣어준다. 또는 else 를 써도 된다.
		}
		
	}
	
	// 자료형(반환값)은 하나로 통일해야된다. 아래와 같이 문자, 정수 두개의 반환값을 쓰면 에러가 남!
//	public void test3() {
//		
//		int num = 1;
//		if(num == 1) {
//			return 100;
//		} else {
//			return "문자열";
//		}
//		
//	}
	
//	public int test4() {
//		return 10, 20, 30;	// , 콤마로 여러개를 찍는건 허용하지 않는다.. 에러남!!(배열이나, list 등을 사용해야된다.)
//	}
	
}

public class MainClass07 {

	public static void main(String[] args) {
		
		TestClass07 t = new TestClass07();
		
		t.test1();
		t.test2();
	}

}
