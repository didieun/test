package quiz;

public class MainQuiz01 {

	public static void main(String[] args) {
		// 이름을 입력받아 출력하는 프로그램(입력기능, 출력기능, main)
		
		TestQuiz01 t = new TestQuiz01();
		
		String name = t.inputName();
		t.printName(name);

	}

}
