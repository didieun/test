package variable;

public class Test02 {
	public static void main(String[] args) {
		//char : 2byte 크기의 문자 하나 저장
		//char는 작은 따옴표로 묶어야 한다
		char ch = 'B';
		String str = "Aabc";
		int num = 5;
		System.out.println(ch);
		System.out.println(str);
		System.out.println(num);
		
		int result = 0;
		System.out.println( result + 10);
		
		result = ch + num;
		System.out.println( "연산 후 : "+result);		
	}
}







