package day08_;

import java.util.ArrayList;
import java.util.Scanner;

class Test01{
	private int kor,eng,math,sum;
	private double avg;
	public void setScore(int kor,int eng,int math) {
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	public ArrayList<Integer> getScore() {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(kor);
		arr.add(eng);
		arr.add(math);
		return arr;
	}
	public String getScore2() {
		return "["+kor+","+eng+","+math+"]";
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
}
public class Ex01 {
	public static void main(String[] args) {
		int k=100,e=90,m=81;
		// 객체 생성후 각각의 값(kor,eng,math,sum,avg)을 저장하세요
		// 출력하세요. 국,영,수,합,평균
		Test01 t = new Test01();
		t.setScore(k, e, m);
		//System.out.println( t.getScore2() );
		//System.out.println( t.getEng() );
		int s =  t.getEng()+t.getKor()+t.getMath();
		t.setSum( s );
		double d =  (double)t.getSum() / 3;
		t.setAvg( d );
		System.out.println( t.getAvg() );
	}
}





