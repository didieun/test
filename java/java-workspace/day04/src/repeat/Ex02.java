package repeat;

public class Ex02 {

	public static void main(String[] args) {
		
		// 제어문은 중첩해서 사용이 가능하다. 
		for(int k = 0; k < 3; k++) {
			System.out.println("=== 상위 반복문");
			for(int i = 0; i < 3; i++) {
				System.out.println(i + "for");
				break;
			}
			System.out.println("상위 반복문 끝 ===");	
			break;    
		}
	
		System.out.println("다음 문장들");
		
		// if 문 안에서는 break 사용 불가!
		// break 는 반복문, switch 문만 사용가능!!!!!!!!
//		int i = 0;
//		if(i < 10) {
//			break;
//		}
		
		for(int k = 0; k < 3; k++) {
			for(int i = 0; i < 3; i++) {
				System.out.println(k + " , " + i);
			}  
		}
		
		System.out.println();
		
		// for 문 구구
		for(int i = 2; i <= 9; i++ ) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i <= 9; i++ ) {
			for(int j = 2; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// while 문 구구단
		// 중첩 while 문 초기값을 해줘야된다.
		int k = 2, n = 1;
		
		while(k <= 9) {
			
			// 중첩 while 문 은 초기화식을 써줘야된다.
			n = 1;
			while(n <= 9) {
				System.out.print(k + " * " + n + " = " + (k * n) + "\t");
				n++;
			}
			k++;
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("=============");
		
		for(int j = 1; j <= 25; j++) {
			System.out.print(j + "\t");
			if( j % 5 == 0) {
				System.out.println();
			}
		}
		
		System.out.println();
		
		for(int j = 1; j <= 25; j++) {
			System.out.print(j + "\t");
			while(j % 5 == 0) {
				System.out.println();
				break;
			}
		}
		
		// i = 1, 6, 11, 16, 21 씩 증가 
		for(int i = 1; i <= 21; i+=5) {
			System.out.print(i + " "); // 1, 6, 11, 16, 21
			for(int j = 1; j < 5; j++) { // j = 1,2,3,4
				int result = i + j; //result =  i = 1 + j(1,2,3,4)
				// 1: 2,3,4,5
				// 2: 7,8,9,10
				// 3: 12,13,14,15
				// 4: 17,18,19,20
				// 5: 22,23,24,25
				System.out.print(result + " ");
			}
			System.out.println();
		}
		
	}

}
