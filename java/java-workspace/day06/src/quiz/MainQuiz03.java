package quiz;

public class MainQuiz03 {

	public static void main(String[] args) {
		// 두수의 합을 입, 출, 연산, 메인 기능으로 만들기 (배열 활용)
		TestQuiz03 t = new TestQuiz03();
		
		int[] num = t.inputNum();
		int sum = t.sumNum(num);
		t.printNum(sum);

	}

}
