package quiz;

public class MainQuiz01 {

	public static void main(String[] args) {
		// 두 수를 입력 받아 큰 수를 출력하는 함수를 만드시오.
		
		TestQuiz01 t = new TestQuiz01();
		
		int[] list = t.inputMethod();
		
		int a = t.testMethod(list);
		t.outputMethod(list, a);
		
	}

}
