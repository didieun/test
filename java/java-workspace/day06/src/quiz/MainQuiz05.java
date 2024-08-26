package quiz;


import java.util.HashMap;

public class MainQuiz05 {

	public static void main(String[] args) {
		// 3번(MainQuiz03 파일)의 내용을 Map 를 각 기능별로 만들기 
		TestQuiz05 t = new TestQuiz05();
		
		HashMap<Integer, Integer> num = t.inputNum();
		int sum = t.sumNum(num);
		t.printNum(sum);

	}

}
