package quiz;

public class MainQuiz02 {

	public static void main(String[] args) {
		// 3개의 이름을 입력받아 출력(배열 활용) (입, 출력, main 기능)
		TestQuiz02 t = new TestQuiz02();
		
		String[] nameList = t.inputName();
		
		t.printName(nameList);
		
	}

}
