package array_;

public class Ex01 {
	public static void main(String[] args) {
		int [][] arr = 
			{ {10,20,30}, {40,50,60}, {70,80,90}, {100,110,120} };
		System.out.println( arr.length );
		System.out.println( arr[2].length );
		/*
		System.out.println( arr[0][0] );
		System.out.println( arr[0][1] );
		System.out.println( arr[0][2] );
		System.out.println( arr[1][0] );
		*/
		System.out.println("-------------");
		for(int i=0 ; i < arr.length ; i++) {
			//System.out.println(i);
			for(int j=0 ; j < arr[i].length  ; j++) {
				//System.out.println( i +", "+j);
				System.out.print( arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}









