package quiz;

import java.util.ArrayList;

public class MainQuiz04 {

	public static void main(String[] args) {
		// 3번(MainQuiz03 파일)의 내용을 ArrayList로 만들기 
		TestQuiz04 t = new TestQuiz04();
		
		ArrayList<Integer> num = t.inputNum();
		int sum = t.sumNum(num);
		t.printNum(sum);

	}

}
