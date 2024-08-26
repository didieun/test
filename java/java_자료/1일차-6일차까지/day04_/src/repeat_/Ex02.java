package repeat_;

public class Ex02 {
	public static void main(String[] args) {
		for(int k = 0 ; k < 3 ; k++ ) {
			System.out.println("===상위 반복문");
			for( int i=0; i < 3 ; i++) {
				System.out.println(i+"for");
				break;
			}
			System.out.println("상위 반복문 끝====");
			break;
		}
		System.out.println("다음 문장들");
		/*
		int i=0;
		if(i<10) {
			break;
		}
		 */

		for(int k = 2 ; k < 10 ; k++ ) {
			for( int i=1; i < 10 ; i++) {
				//System.out.println( k + " x " + i + " = " + k*i );
			}
		}
		// while로 변경해 주세요
		int k = 2 ;
		int i = 1;
		while( k < 10) {
			i=1;
			while(  i < 10 ) {
				//System.out.println( k + " x " + i + " = " + k*i );
				i++;
			}
			k++;
		}
		System.out.println("------------");
		for(int j = 1 ; j <= 25 ; j++ ) {
			//System.out.print(j + "\t");
			if( j%5 == 0);
				//System.out.println();
		}
/*
		for( i = 1; i<22 ; i+=5 ) {
			System.out.print( i + " " );
			for(int j = 1 ; j<5 ; j++) {
				System.out.print( j + i + " ");
			}
			System.out.println();
		}
	*/	
		// i = 1, 6, 11, 16, 21, 
		for ( i = 1; i < 22; i += 5) {
		    System.out.print(i + " ");// 1, 6, 11, 16, 21, 
		    for (int j = 1; j < 5; j++) { //j = 1,2,3,4
		        int result = i + j; // i=1 + j(1,2,3,4)
		        //1 : 2,3,4,5
		        System.out.print(result + " ");
		    }
		    // 내부 루프가 끝나면 새로운 줄로 넘어감
		    System.out.println();
		}
	}
}













