package array_;

public class Quiz01 {
	public static void main(String[] args){
		   int arr[] = new int[] {10,54,13,17,25,30};
		   for(int i=0 ; i <  arr.length ; i++) {
			   if( arr[i] % 2 == 0 ) {
				   System.out.println("짝 : "+arr[i]);
			   }else {
				   System.out.println("홀 : "+arr[i]);
			   }
		   }
		   System.out.println("--------------");
		   for(int i : arr) {
			   if( i % 2 == 0 ) {
				   System.out.println("짝 : "+i);
			   }else {
				   System.out.println("홀 : "+i);
			   }
		   }
		   System.out.println("--------------");
		   for(int i : arr) {
			   String s = (i%2 == 0)?"짝 : "+i : "홀 : "+i;
			   System.out.println( s );
			   
		   }
	}
}











