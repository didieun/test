package set_get;

public class QuizMain02 {
	public static void main(String[] args) {
		int k=100, e=90, m=80;
		QuizSetGet02 q = new QuizSetGet02();
		q.setKor(k);
		q.setEng(e);
		q.setMath(m);
		q.setSum(k+e+m);
		q.setAvg( q.getSum() / 3.0 );
		System.out.println("국 : "+q.getKor());
		System.out.println("영 : "+q.getEng() );
		System.out.println("수 : "+q.getMath() );
		System.out.println("합 : "+q.getSum() );
		System.out.println("평균 : "+q.getAvg() );
	}
}
