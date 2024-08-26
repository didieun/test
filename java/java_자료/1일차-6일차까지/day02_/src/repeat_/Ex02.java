package repeat_;

public class Ex02 {
	public static void main(String[] args) {
		int i = 1;
		
		for( i = 1 ; i<=10 ; i++ ) {
			if( i % 2 == 0 )
				System.out.println(i+" : 짝");
			else
				System.out.println(i+" : 홀");
		}
		System.out.println("=================");
		i = 1;
		while( i <= 10 ) {
			if( i % 2 == 0 )
				System.out.println(i+" : 짝");
			else
				System.out.println(i+" : 홀");
			i++;
		}
		/*
		
		if( i % 2 == 0 )
			System.out.println(i+" : 짝");
		else
			System.out.println(i+" : 홀");
		i++;
		
		if( i % 2 == 0 )
			System.out.println(i+" : 짝");
		else
			System.out.println(i+" : 홀");
		i++;
		
		if( i % 2 == 0 )
			System.out.println(i+" : 짝");
		else
			System.out.println(i+" : 홀");
		i++;
		*/
	}
}
