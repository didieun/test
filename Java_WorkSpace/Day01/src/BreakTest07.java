// 참조변수에 null만 대입한 상태에서 사용하면 NullPointerException 예외 오류가 발생한다. 이런경우는 
// try~cathch 문으로 예외 처리해야 한다.
class MyDate07{
	int year = 2024;
	int month = 8;
	int day = 21;
}// MyDate07 class

public class BreakTest07 {

	public static void main(String[] args) {
		MyDate07 d = null;
		
		try {	// 정상구문 실행
			System.out.println(d.year + "년 " + d.month + "월 " + d.day + "일 ");	// 예외가 발생하면
			// 아래문장 실행안함.
			System.out.println("이 문장은 실행 안함.");
			
		} catch(Exception e) {	// 예외 처리함
			System.out.println("예외 오류 메시지: " + e.getMessage());
			e.printStackTrace();	// 예외 족적을 남김
		}
	}
}