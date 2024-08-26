package array_;

public class Ex01 {
	public static void main(String[] args) {
		int [] arr = new int[5];
		System.out.println( arr[0] );
		arr[0] = 100;
		arr[1] = 200;
		System.out.println( arr[0] );
		System.out.println( arr[1] );
		System.out.println( arr[2] );
		//System.out.println( arr[5] );
		
		double dos [] = new double[] {1.11, 2.22, 3.33 };
		System.out.println( dos[0] );
		System.out.println( dos[1] );
		System.out.println( dos[2] );
		//System.out.println( dos[3] );
		
		System.out.println("int length : " + arr.length );
		System.out.println("dos length : " + dos.length );
		
		for(int i=0; i < dos.length ; i++) {
			System.out.println( dos[i] );
		}
		
		String[] str = {"aaa","bbb","ccc"};
		for(int i=0 ; i<str.length ;i++) {
			System.out.println( str[i] );
		}
		System.out.println("----- for each -----");
		// arr = [ 1,2,3 ]
		// dos = [1.11, 2.22, 3.33 ]
		// str = ["aa","bb","cc"]
		for( double d : dos ) {
			System.out.println( d );
		}
		for( String s : str ) {
			System.out.println( s );
		}
		
	}
}










