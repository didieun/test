package variable_;
class AAA{
	public static String path = "c:/test폴더/java";
	public String n = "홍길동";
	public void 저장소역할() {
		System.out.println( "내용을 "+path+"에 저장합니다");
	}
}
class BBB{
	public void 가져오기() {
		//AAA a = new AAA();
		System.out.println( "내용을 "+AAA.path+"에서 가져옵니다");
	}
}
public class MainClass02 {
	public static void main(String[] args) {
		System.out.println( TestClass02.n2 );
		AAA a = new AAA();
		a.저장소역할();
		BBB b = new BBB();
		b.가져오기();
	}
}












