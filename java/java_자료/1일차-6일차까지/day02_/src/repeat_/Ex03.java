package repeat_;

public class Ex03 {
	public static void main(String[] args) {
		//while(true) {
		/*
		for( ; ; ) {
			System.out.println("while");
		}
		*/
		System.out.println("다음 문장");
		
		
		for(int k=0 ; k<3 ; k++) {
			System.out.println("for : "+k);
		}
		int i = 0;
		//while( i<3 ) {
		for( ; i<3 ; ) {
			System.out.print("while : "+i);
			i++;
		}
		//System.out.println( k );
		System.out.println();
		i=1;
		for( ; i <= 25; ) {
			System.out.print(i + "\t");
			if( i % 5 == 0 )
				System.out.println();
			i++;
		}
	}
}















