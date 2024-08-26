package repeat_;

public class Ex01 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		for( i = 1 ; i <= 10 ; i++ ) {
			//System.out.println( i );
			sum = sum + i;
		}
		//System.out.println("i : "+i);
		
		int j=1, sum2 = 0;
		while( j <= 10 ) {
			//System.out.println( j );
			sum2 = sum2 + j;
			j++;
		}
		//System.out.println("sum2 : "+sum2);
		/*
		sum = sum + i; i++;
		sum = sum + i; i++;
		sum = sum + i; i++;
		sum = sum + i; i++;
		sum = sum + i; i++;
		sum = sum + i; i++;
		sum = sum + i; i++;
		sum = sum + i; i++;
		sum = sum + i; i++;
		sum = sum + i;
		*/ 
		//System.out.println( sum );
		//1 ~ 10 까지의 총합, 홀합, 짝합을 구하세요
		//합을 구할 변수 3개 필요(총합, 홀합, 짝합) 
		/*
		 합을 구하기 힘들경우 먼저 출력 해보세요
		 짝수 : 2,4,6,,,
		 홀수 : 1,3,5,,,
		 전체숫자 : 1,2,3,4,,,,10
		 그리고 나서 합을 어떻게 표현할지 생각해 보세요
		 */
		sum = 0;
		int oddSum =0 , evenSum = 0;
		for(int k = 1 ; k <= 10 ; k += 2 ) {
			//System.out.println(k);
			oddSum += k;
		}
		System.out.println("홀 합 : "+oddSum);
		for(int k = 2 ; k <= 10 ; k += 2 ) {
			//System.out.println(k);
			evenSum += k;
		}
		System.out.println("짝 합 : "+evenSum);
		sum = 0;
		oddSum =0; evenSum = 0;
		i = 1;
		while( i <= 10 ) {
			System.out.println("while : "+i);
			i+=2;
		}
		i=0;
		for( i=1 ; i <= 10 ; i++ ) {
			if( i % 2 == 0 )
				evenSum += i;
			else
				oddSum += i;
		}
	}
}

