package array_;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = new int[] {10,54,13,17,25,30};
		String odd_even=null;
		System.out.print("짝수, 홀수 입력 : ");
		odd_even = input.next();
		/*
		짝수 입력시 : index가 짝수 번째인값 출력(0,2,4)10,13,25
		홀수 입력시 : index가 홀수 번째인값 출력(1,3,4)54,17,30
		*/
		/*
		for(int i = 0 ; i<arr.length ; i++) {
			if( odd_even.equals("짝수") && i % 2 == 0 ) {
				System.out.println(arr[i]);
			}else if(odd_even.equals("홀수") ){
				if( i % 2 == 1)
					System.out.println(arr[i]);
			}
		}
		*/
		/*
		int i = 0;
		if( odd_even.equals("홀수") ) {
			i = 1;
		}
		//{10,54,13,17,25,30}
		for( ; i <arr.length ; i+=2 ) {
			System.out.println( arr[i] );
		}
		*/
		for( int i = (odd_even.equals("홀수"))?1:0 ; 
								i <arr.length ; i+=2 ) {
			System.out.println( arr[i] );
		}
	}
}














