package list_;

import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {
		int num = 10;
		System.out.println( num );
		Integer num2 = 100;
		System.out.println( num2 );
		ArrayList< Integer > arr = new ArrayList<>();
		//arr[0] = 100;
		arr.add( 100 );
		arr.add( 200 );
		System.out.println( arr.get(0) );
		System.out.println( arr.get(1) );
		System.out.println( arr.size() );
		int[] arr2 = new int[3];
		System.out.println( arr2.length );
		
		ArrayList<String> arr3 = new ArrayList<>();
		arr3.add("aaa");
		arr3.add("bbb");
		System.out.println( arr3 );
		for(int i=0 ; i<arr3.size() ; i++) {
			System.out.println( arr3.get(i) );
		}
		System.out.println("--- foreach ---");
		for( String s : arr3 ) {
			System.out.println( s );
		}
	}
}












