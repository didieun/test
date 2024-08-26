package repeat;

public class Ex01 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		for(i = 1; i <= 10; i++) {
			sum += i;
		}
		
		System.out.println("i : " + i);
		
		System.out.println("1 ~ 10 합은? " + sum);
		
		System.out.println();
		
		int j = 1, sum2 = 0;
		
		while(j <= 10) {
			System.out.println(j);
			sum2 += j;
			j++;
		}
		
		System.out.println("1 ~ 10 합은? " + sum2);
		
		System.out.println();
		
		// 1 ~ 10 까지의 총합, 홀합, 짝합을 구하세요.
		// 합을 구할 변수 3개 필요(총합, 홀합, 짝합)
		/*
		  합을 구하기 힘들 경우 먼저 출력 해보세요.
		  짝수 : 2,4,6,8,10
		  홀수 : 1,3,5,7,9
		  전체숫자 :  1~ 10
		  그리고 나서 합을 어떻게 표현할지 생각해 보세요.
		 */
		
		int total = 0, oddSum = 0, evenSum = 0;
		
		
		for(int a = 1; a <= 10; a++) {
			if(a % 2 == 0) {
				evenSum += a;
			}else {
				oddSum += a;
			}
			total += a;
		}
		
		System.out.println("짝수 합: " + evenSum);
		System.out.println("홀수 합: " + oddSum);
		System.out.println("총합: " + total);
		
		// 선생님 풀이 
//	      sum = 0;
//	      int oddSum =0 , evenSum = 0;
//	      for(int k = 1 ; k <= 10 ; k += 2 ) {
//	         //System.out.println(k);
//	         oddSum += k;
//	      }
//	      System.out.println("홀 합 : "+oddSum);
//	      for(int k = 2 ; k <= 10 ; k += 2 ) {
//	         //System.out.println(k);
//	         evenSum += k;
//	      }
//	      System.out.println("짝 합 : "+evenSum);
//	      sum = 0;
//	      oddSum =0; evenSum = 0;
//	      i = 1;
//	      while( i <= 10 ) {
//	         System.out.println("while : "+i);
//	         i+=2;
//	      }
//	      i=0;
//	      for( i=1 ; i <= 10 ; i++ ) {
//	         if( i % 2 == 0 )
//	            evenSum += i;
//	         else
//	            oddSum += i;
//	      }

	}

}
