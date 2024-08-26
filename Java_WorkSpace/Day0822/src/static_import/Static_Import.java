package static_import;
// static import 별로 안중요함.
// static import 문을 사용하면 static 멤버를 호출할 때 클래스명을 생략할수 있다. 코드가 간결해 진다. 많이 사용하지 않는다.

import static java.lang.System.out;
import static java.lang.Math.*;

public class Static_Import {
	public static void main(String[] args) {
		System.out.println(Math.random());
		out.println(random()); // static import
		
		System.out.println("원주율값: " + Math.PI);
		out.println("원주율값: " + PI); // static import
	}
}