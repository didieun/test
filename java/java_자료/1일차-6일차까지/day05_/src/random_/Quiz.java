package random_;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Quiz {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		int ran = 0 ;
		while( arr.size()<6 ){
			ran = (int)(Math.random()*6)+1;
			if(arr.contains(ran)==false)  
				arr.add(ran);
		}
		System.out.println("=== ArrayList Lotto ===");
		System.out.println( arr );
		
		
		Random rand = new Random();
		HashSet<String> hs = new HashSet<>();
		while(hs.size()<6){
			ran = rand.nextInt(6)+1;  
			hs.add(ran+""); 
		}
		System.out.println("=== HashSet Lotto ===");
		System.out.println( hs );
	}

}







