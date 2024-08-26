package method;

public class MainClass06 {

	public static void main(String[] args) {
		
		TestClass06 t = new TestClass06();
		
		String s = t.test(0);

		int n = t.inputData();
//		System.out.println("n: " + n);
		int sum = t.opData(n);
//		System.out.println("main 합: " + sum);
		
		t.printData(n, sum);
	}

}
