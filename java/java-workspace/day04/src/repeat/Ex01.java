package repeat;

public class Ex01 {
	public static void main(String[] args) {
			
		int i = 20, sum = 0;
		
		// do - while :  do 에 들어오는 식은 무조건 한번은 실행하고, while 문에 들어가는 조건식이 true 면 false 가 될때까지 do 식이 실행된다.
		do {
			sum += i;
			System.out.println(i + " do while");
			i++;
		} while(i < 10);
		
		System.out.println("sum 1 : " + sum);
		
		System.out.println("=========================");
		
		i = 20; sum = 0;
		while(i < 10) {
			sum += i;
			System.out.println(i + "while");
			i++;
		};
		
		System.out.println("sum 1 : " + sum);

	}

}
