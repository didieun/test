package repeat_;

public class Ex01 {
	public static void main(String[] args) {
		int i=20, sum=0;
		do {
			sum += i;
			System.out.println(i+"do while");
			i++;
		}while( i < 10);
		System.out.println("sum 1 : "+sum);
	System.out.println("---------------");
		i = 20; sum = 0;
		while( i < 10) {
			sum += i;
			System.out.println(i+"while");
			i++;
		};
		System.out.println("sum 1 : "+sum);
	}
}





