package method_;

import java.util.Scanner;

public class QuizMain {
	public static void main(String[] args) {
		/*
		//1. 두수를 입력 받아 큰 수를 출력하는 함수를 만드시오.
		QuizOp q = new QuizOp();
		int[] arr = q.input();
		int index = q.op( arr );
		q.print(arr, index);
		//System.out.println( index );
		//System.out.println( arr[index] );
		*/
		/*
		//2. 입력받은 값 짝, 홀 구분
		QuizOp q = new QuizOp();
		int num = q.input();
		String msg = q.op( num );
		q.print( msg );
		
		int result = q.op2(num);
		if(result == 0 ) {
			
		}else {
			
		}
		*/
		
		/*
		//수를 입력 받아 소수를 판별하는 함수 제작
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		int cnt = 0;
		for(int i=1 ; i<=num ; i++) {
			//System.out.println("num : "+num+", i : "+i);
			//System.out.println( num % i  );
			if( num % i == 0 )
				cnt++;
		}
		System.out.println( cnt );
		if(cnt == 2) {
			System.out.println(num+"은 소수");
		}
		*/
		
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		int result = 0;
		if( num < 0) {
			//result = -num;
			result = num * -1;
		}else {
			result = num;
		}
		System.out.println( num+"의 절대값 : "+result);	
	}
}















