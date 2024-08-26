package quiz;

public class MainQuiz05 {

	public static void main(String[] args) {
		// 절대값을 구하는 함수를 정의하시오
		TestQuiz05 t = new TestQuiz05();
		
		int num = t.inputMethod();
		int result = t.testMethod(num);
		t.outputMethod(num, result);
		
	}

}
