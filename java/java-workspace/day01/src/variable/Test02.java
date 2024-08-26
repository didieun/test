package variable;

public class Test02 {

	public static void main(String[] args) {
		// char:  2bye 크기의 문자하나 저장
		// char 는 작은 따옴표로 묶어야 한다.
		char ch = 'A';
		
		// String: String 은 문자열이기 때문에 "" 큰옴표로 써야된다.문자 하나만 써도 되고 여러개 써도 된다.
		// String 은 클래스이다.
		String str = "A";
		int num = 5;
		
		System.out.println(ch);
		System.out.println(str);
		System.out.println(num);
		
		int result = 0;
		// int result; -> 초기화를 안하면 더미값(알수 없는값이 들어감) 그러므로 int result = 0; 해주는게 좋다.
	
		System.out.println(result + 10);
		
		result = ch + num;    // ch 변수 안에 있는 A값은 유니코드값으로 65이므로 result 는 65 + 5 는 70이되는거다.
		//유니코드는 - > 2byte로 출력
		System.out.println("연산 후: " + result);
		

	}

}
