package repeat;

public class Ex03 {

	public static void main(String[] args) {
		
		// 무한반복 
//		while(true) {
//			System.out.println("while");
//		}
		
		// for문 무한반복
//		for( ; ; ) {
//			System.out.println("for");
//		}
		// 무한반복일떄 (break; 가 없을때 - 반복문 빠져나오는것) 다음 식 에러남... 
		
		System.out.println("다음 문장");
	
		for(int k = 0; k < 3; k++) {
			System.out.println("for: " + k);
		}
		
		int i = 0; 
		
		//while(i < 3) {
		for( ; i < 3 ; ) {   // 이렇게 for 문을 쓸수가 있다.
			System.out.println("while: " + i);
			i++;
		}
		
	}

}
