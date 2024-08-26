package array;

public class Ex01 {

	public static void main(String[] args) {
		// 다차원 배열 :  2차원 이상의 배열을 의미 , 배열을 입체적으로 표현한 모양 
		int[][] arr = { 
		// 인덱스 -> 0 ,1, 2
				{10, 20, 30}, // 인덱스 0
				{40, 50, 60}, // 인덱스 1
				{70, 80, 90}, // 인덱스 2
				{100, 110, 120} // 인덱스 3
		};
		
		// arr[1][2] -> 앞 숫자는 세로줄, 뒤에는 가로줄의 인덱스
//		System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);
//		System.out.println(arr[0][2]);
//		System.out.println(arr[1][0]);
		
		System.out.println(arr.length); 
		System.out.println(arr[2].length);
		
		System.out.println("----------------------");
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
		

	}

}
