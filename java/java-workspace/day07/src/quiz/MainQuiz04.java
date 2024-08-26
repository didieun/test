package quiz;

public class MainQuiz04 {

	public static void main(String[] args) {
		// 수를 입력받아 소수를 판별하는 함수 제작
		TestQuiz04 t = new TestQuiz04();
		
		int num = t.inputMethod();
		int cnt = t.testMethod(num);
		t.outputMethod(num, cnt);
		
	}

}
