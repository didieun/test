package array_;
import java.util.Scanner;
public class Quiz02 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int arr[] = new int[] {10,54,13,17,25,30};
		String odd_even=null;
		System.out.print("짝수, 홀수 입력 : ");
		odd_even = input.next();
		
		for(int i =0 ; i<arr.length ; i++) {
			if( odd_even.equals("짝수") && arr[i] % 2 == 0 ) {
				System.out.println(arr[i]);
			}else if(odd_even.equals("홀수") ){
				if( arr[i] % 2 == 1)
					System.out.println(arr[i]);
			}
		}
	}
}













