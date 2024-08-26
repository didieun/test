package array;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// 짝수 또는 홀수 입력 시 짝수면 짝수 값, 홀수면 홀수 값만 출력하시오.
		Scanner input = new Scanner(System.in);
		int arr[] = new int[] {10,54,13,17,25,30};
		
		String odd_even=null;
		
		System.out.print("짝수, 홀수 입력 : ");
		odd_even = input.next();
		
		for(int i : arr) {
			if(odd_even.equals("짝수")) {
				if(i % 2 == 0) {
					System.out.println("짝수 : " + i);
				}
			} else {
				if(i % 2 != 0) {
					System.out.println("홀수 : " + i);
				}
			}
		}
		
		System.out.println();
		
		// 또는
		for(int i = 0; i < arr.length; i++) {
			if(odd_even.equals("짝수") && arr[i] % 2 == 0) {
				System.out.println("짝수 : " + arr[i]);
				
			} else if(odd_even.equals("홀수") && arr[i] % 2 != 0){
				System.out.println("홀수 : " + arr[i]);
			}
		}
		
		input.close();

	}

}
