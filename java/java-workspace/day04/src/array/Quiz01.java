package array;

public class Quiz01 {

	public static void main(String[] args) {
		// 반복문을 이용해서 arr에 저장되어있는 짝수의 값과 홀수의 값을 따로 출력하시오.
		int arr[] = new int[] {10, 54, 13, 17, 25, 30};
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.println("짝수: " + arr[i]);
			} else {
				System.out.println("홀수: " + arr[i]);
			}
		}
		
		System.out.println();
		
		for(int i : arr) {
			if(i % 2 == 0) {
				System.out.println("짝수: " + i);
			} else {
				System.out.println("홀수: " + i);
			}
		}
		
		System.out.println();
		
		for(int i : arr) {
			String s = (i % 2 == 0) ? "짝수: " + i : "홀수: " + i;
			System.out.println(s);
		}

	}

}
