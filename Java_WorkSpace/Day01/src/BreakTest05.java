/*	기본 타입과 참조 즉 레퍼런스 자료형(타입)의 차이점.
 * 	new 키워드로 새로운 객체를 생성하면 새로운 객체주소가 할당된다.
 */

class MyDate {
	int year = 2023;
	int month = 10;
	int day = 10;
}

public class BreakTest05 {

	public static void main(String[] args) {

		int a = 7;
		int b = a;
		System.out.println("a: " + a + ", b: " + b);	// 7, 7
		b = 10;
		System.out.println("a: " + a + ", b: " + b);	// 7, 10
		
		MyDate d = new MyDate();
		MyDate t = d;	// 같은 주소를 가르킨다.
		
		System.out.println(d.year + "년 " + d.month + "월 " + d.day + "일");	// 2023년 10월 10일
		System.out.println(t.year + "년 " + t.month + "월 " + t.day + "일");	// 2023년 10월 10일
		
		t.year = 2024;	t.month = 8;	t.day = 20;	// t와 d는 같은 주소를 가리키고 있기 때문에 년월일도 같이 변경이 된다.
		System.out.println(d.year + "년 " + d.month + "월 " + d.day + "일");	// 2024년 8월 20일
		System.out.println(t.year + "년 " + t.month + "월 " + t.day + "일");	// 2024년 8월 20일
		
		t = new MyDate();	// 새로운 객체 주소가 할당되면 t와 d는 다른 주소를 가진다.
		t.year = 2025;	t.month = 3;	t.day = 10;
		System.out.println(d.year + "년 " + d.month + "월 " + d.day + "일");	// 2024년 8월 20일
		System.out.println(t.year + "년 " + t.month + "월 " + t.day + "일");	// 2025년 3월 10일
	}

}
