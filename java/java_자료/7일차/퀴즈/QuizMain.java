package method_;

import java.util.Scanner;

public class QuizMain {
	public static void main(String[] args) {
		//두수를 입력 받아 큰 수를 출력하는 함수를 만드시오.
		QuizOp q = new QuizOp();
		int[] arr = q.input();
		int index = q.op( arr );
		q.print(arr, index);
		//System.out.println( index );
		//System.out.println( arr[index] );
		
	}
}








