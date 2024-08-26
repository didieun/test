package quiz;

public class MainQuiz03 {

	public static void main(String[] args) {
		// 입력받은 값이 3의 배수인지 아닌지 판별
		TestQuiz03 t = new TestQuiz03();
		
		int num = t.inputMethod();
		int a = t.testMethod(num);
		t.outputMethod(a);
		
	}

}
