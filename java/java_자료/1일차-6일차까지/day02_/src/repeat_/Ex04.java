package repeat_;

public class Ex04 {
	public static void main(String[] args) {
		boolean bool = true;
		int i=0;
		//while(bool)
		for( ; bool ; ) {
			i++;
			//System.out.println(11);
			if( i > 3 )
				bool = false;
		}
		
		i=0;
		while( true ) {
			i++;
			//System.out.println( i );
			if(i>3)
				break;
		}
		System.out.println("------------");
		i = 0;
		for( ; i < 5 ; ) {
			i++;
			if( i == 3 ) {
				System.out.println(33333);
				//break;
				continue;
			}
			System.out.println("i : "+ i);
		}
	}
}











