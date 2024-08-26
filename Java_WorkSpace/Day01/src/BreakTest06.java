//레퍼런스에 의한 호출 방식 예제 -> 값이 전달 되는것이 아니라 객체 주소가 전달 된다.
class MyDate06 {
	int year = 2023;
	int month = 8;
	int date = 21;
}

class RefMethod{
	void changDate(MyDate06 t) {	// MyDate06 t=d; -> t와 d객체 주소는 같다
		t.year = 2024;
		t.month = 9;
		t.date = 10;
	}
}

public class BreakTest06 {

	public static void main(String[] args) {
		MyDate06 d = new MyDate06();
		RefMethod rm = new RefMethod();
		
		System.out.println("changeDate() 메서드 호출전: " + d.year + "/" + d.month + "/" + d.date);
		rm.changDate(d);	// d객체 주소를 전달
		System.out.println("changDate() 메서드 호출후: " + d.year + "/" + d.month + "/" + d.date);	// 2024년 9월 10일
	}

}