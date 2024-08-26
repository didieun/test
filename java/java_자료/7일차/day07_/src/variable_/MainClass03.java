package variable_;
class CCC{
	public static int num = 123;
	public static int[] arr;
	static {
		num = 123;
		arr = new int[3];
		for(int i=1 ; i< arr.length ; i++) {
			arr[i] = i;
		}
	}
	public final static String KOREA = "대한민국";
	public void test() {
		num = 456;
	}
}
public class MainClass03{
	int num;
	public static void main(String[] args) {
		//CCC.KOREA = "미국";
		System.out.println( CCC.KOREA );
		//num = 12;
	}
}









