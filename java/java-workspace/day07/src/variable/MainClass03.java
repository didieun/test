package variable;

class CCC{
	
	public static int num;
	public static int[] arr;
	
	// 초기화 -> static 은 이런식으로 영역을 만들어서 영역안에서 초기화 한다. 
	static {
		num = 123;
		arr = new int[3];
		
		for(int i = 1; i < arr.length; i++) {
			arr[i] = i;
		}
	}
	
	public final static String KOREA = "대한민국";
	// 상수화 -> final 을 붙이면 값을 더이상 변경할수 없고, 변수명은 대문자로!
	
	public void test() {
		num = 456;
	}
	
}

public class MainClass03 {
	
	// 참고
	static int n = 1234;
	int n2 = 456;
	
	public static void test() {
		System.out.println(n + "test");
	}

	public static void main(String[] args) {

		// 참고 
		System.out.println(n + "main");
		MainClass03 m = new MainClass03();
		System.out.println(m.n2 + "main");
		
		System.out.println(CCC.KOREA);
		
	}

}
