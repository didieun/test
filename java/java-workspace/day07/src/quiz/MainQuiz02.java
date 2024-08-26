package quiz;

public class MainQuiz02 {

	public static void main(String[] args) {
		// 입력 받은 값이 짝수 인지 홀수인지 판별하는 함수 제작 
		TestQuiz02 t = new TestQuiz02();
		
		int num = t.inputMethod();
		String msg = t.testMethod(num);
		t.outputMethod(msg);
		
	}

}
