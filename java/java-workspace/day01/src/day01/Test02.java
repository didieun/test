package day01;

public class Test02 {

	public static void main(String[] args) {
		
		System.out.println("안\n녕\n하");
		// \n -> 다음
		System.out.println("1\t123456\t12345678\t1");
		// \t -> 8칸 공간 만들고 띄어쓰기
		System.out.println("이름\t나이");
		System.out.println("홍길동\t20");
		System.out.println(" \" \\ ");
		// \" -> " 표시 \\ -> \ 표시
		System.out.println("\"C:\\0.공유자료\\내가 만든 폴더\""); 
		// 주소중 공백이(띄어쓰기)가 있을경우 " " 큰 따움표로 표시해준다. 공백은 구분자로 인식
		
		// ** 연산 ** 
		System.out.println("=========================");
		System.out.println(100 + 100);
		System.out.println("100" + "100");
		// 문자일때 +은 문자열을 이어주는것(이어쓰는것)
		System.out.println("100" + 1234);
		// 문자일때 +은 숫자도 이어써주는것이다.
		System.out.println("백" + 100 + 100);
		// 문자 다음에 숫자 + 숫자는 문자처럼 이어쓰기가 된다.
		System.out.println("백" + (100 + 100));
		// 연산을 하고 싶으면 숫자에 () 소괄호를 써준다.
		
		System.out.println();
		
		System.out.println("=======================================");
		System.out.println("이름\t나이\t전화번호\t\t회비\t");
		System.out.println("=======================================");
//		System.out.println("홍길동\t\"15\"\t3672-1234\t\\20000");
		System.out.println("홍길동\t" + "\"15\"\t" + 3672 + "-" + 1234 + "\t\\20000");
		System.out.println("고길동\t\"" + 15 + "\"\t" + 2238 + "-" + 1234 + "\t\\30000");
		System.out.println("김말이\t" + "\"15\"\t" + 1234 + "-" + 1234 + "\t\\50000");
		System.out.println("----------------------------------------");
		System.out.println("총합계\t\t\t\t\\100000");
		System.out.println("----------------------------------------");
		

	}

}
