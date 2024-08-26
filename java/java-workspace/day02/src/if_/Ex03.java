package if_;

public class Ex03 {

	public static void main(String[] args) {
		
		int num = 11;
		
		if(num == 10) {
			System.out.println("if 실행");
		} else {
			System.out.println("else");
		}
		
		System.out.println("다음 문장들 실행");
		
		// 초기화
		int n1, n2 = 10;
		
		if(n2 > 100) {
			n1 = 100; // else 가 들어가면 둘중에 하나가 실행되기때문에... 
		}else {
			n1 =1234;
		}
		
		System.out.println(n1);
		
//		int n1, n2;
//		n2 = n1 + 10; // n1의 값이 없기 때문에 연산할때도 에러가 남
//		System.out.println(n1); // 초기화를 안했기때문에 에러( 알수없는 값이 들어갔기때문에)
		
		int i = 0;
		double d = 0;
		char ch = 0;
		String str = null;
		// 타입에서 첫번째 문자가 소문자면 0으로 초기화, 첫번째 문자가 대문자면(class 이기때문에 ) null 이라고 초기화 해준다.
		
		// 중첩 if문 
		int n = 10;
		
		if(n % 2 == 0 && n % 3 == 0) {
			System.out.println("짝수면서 3의 배");
			
		} else {
			System.out.println("아님");
		}
		
		if(n % 2 == 0) {
			System.out.println("짝수");
			if(n % 3 == 0) {
				System.out.println("3의 배수");
			} else {
				System.out.println("3의 배수가 아님");
			}
		} else {
			System.out.println("홀수");
			if(n % 3 == 0) {
				System.out.println("3의 배수");
			} else {
				System.out.println("3의 배수가 아님");
			}
		}

	}

}
