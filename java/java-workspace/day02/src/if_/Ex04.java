package if_;

public class Ex04 {

	public static void main(String[] args) {
		// if - else if
		// 다중 if 문 - 각 조건에 맞는 부분을 찾아서 실행
		int num = 150;
		
		if(num > 100) {
			System.out.println("100보다 크다");
		} else if(num > 80) {
			System.out.println("80보다 크다");
		} else if(num > 50) {
			System.out.println("50보다 크다");
		} else {
			System.out.println("그 외의 값");
		}
		
		System.out.println("다음 문장들 실행!!!!");

	}

}
