package set_get;

public class MainQuiz02 {

	public static void main(String[] args) {
		
		int k = 100, e = 90,m = 80;
		// 객체 생성후 각각의 값(kor,eng,math,sum, avg)을 저장하세요 
		// 출력하세요. 국,영,수,합, 평균
		
		TestQuiz02 t = new TestQuiz02();
		
		int sum = k + e + m;
		double avg = sum / 3; 
		
		t.setKor(k);
		t.setEng(e);
		t.setMath(m);
		t.setSum(sum);
		t.setAvg(avg);
		
		System.out.println("국어: " + t.getKor());
		System.out.println("영어: " + t.getEng());
		System.out.println("수학: " + t.getMath());
		System.out.println("합계: " + t.getSum());
		System.out.println("평균: " + t.getAvg());
		
	}

}
