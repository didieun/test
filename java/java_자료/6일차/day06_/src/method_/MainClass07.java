package method_;
class TestClass07{
	public void test1() {
		int num = 1;
		if( num == 1 ) {
			System.out.println(111);
			return;
		}
		System.out.println("다음 문장실행");
	}
	public String test2() {
		int num = 1;
		if(num == 1) {
			return "성공";
		}
		else
			//첫 문자가 소문자인 자료형일 경우 return 0;
			return null;
	}
	/*
	public void test3() {
		int num = 1;
		if(num == 1)
			return 100;
		else
			return "문자열";
	}
	*/
	/*
	public int test4() {
		return 10,20,30;
	}
	*/
}
public class MainClass07 {
	public static void main(String[] args) {
		TestClass07 t = new TestClass07();
		t.test1();
	}
}





