package method;

public class MainClass02 {

	public static void main(String[] args) {
		int num;
		
//		System.out.print("수 입력: ");
//		num = input.nextInt();
		
		TestClass02 t = new TestClass02();
		num = t.test();
		
		if(num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		num = t.test();
		
//		System.out.print("수 입력: ");
//		num = input.nextInt();
		
		if(num % 3 == 0) {
			System.out.println("3의 배수");
		} else {
			System.out.println("3의 배수 아님!!");
		}
	
	}

}
