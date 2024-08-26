package method_;

import java.util.Scanner;

public class QuizOp {
	public int[] input() {
		Scanner input = new Scanner(System.in);
		int n1, n2;
		System.out.println("두 수 입력");
		n1 = input.nextInt();
		n2 = input.nextInt();
		
		int[] arr = {n1, n2};
		return arr;
	}
	public int op( int[] arr ) {
		if(arr[0] > arr[1]) {
			return 0;
			//System.out.println(arr[0] +" 큰수");
		}else {
			return 1;
			//System.out.println(arr[1] +" 큰수");
		}
	}
	public void print(int[] arr,
					int index) {
		System.out.println( index );
		System.out.println( arr[index] );
		
	}
}





















