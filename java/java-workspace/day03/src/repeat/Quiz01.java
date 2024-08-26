package repeat;

public class Quiz01 {

	public static void main(String[] args) {
		
		int i;
		
		// for 
		for(i = 1; i <= 25 ; i++) {
			System.out.print(i + "\t");
			if(i % 5 == 0) {
				System.out.println();
			}
		}
		
		System.out.println();
		
		// while
		i = 1;
		while(i <= 25) {
			System.out.print(i + "\t");
			if(i % 5 == 0) {
				System.out.println();
			}
			i++;
		}
		
	}

}
