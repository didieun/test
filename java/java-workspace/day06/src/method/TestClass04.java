package method;

public class TestClass04 {

	public void sumFunc(int num) {
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		
		System.out.println("1 ~ " + num + "까지의 합: " + sum);
	}
	
}
