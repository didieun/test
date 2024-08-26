package repeat;

public class Ex02 {

	public static void main(String[] args) {
		
		int i = 1;
		
		// for 
		for(i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.println(i + ": 짝수");
			} else {
				System.out.println(i + ": 홀수");
			}
		}
		
		System.out.println("====================================");
		
		// while 문
		i = 1;
		while(i <= 10) {
			if(i % 2 == 0) {
				System.out.println(i + ": 짝수");
			} else {
				System.out.println(i + ": 홀수");
			}
			i++;
		}
		
		System.out.println("====================================");
		
		// if 문으로 작성후 동일 한 코드는 반목문으로(for, while)
		i = 1;
		if(i % 2 == 0) {
			System.out.println(i + ": 짝수");
		} else {
			System.out.println(i + ": 홀수");
		}
		i++;
		
		if(i % 2 == 0) {
			System.out.println(i + ": 짝수");
		} else {
			System.out.println(i + ": 홀수");
		}
		i++;
		
		if(i % 2 == 0) {
			System.out.println(i + ": 짝수");
		} else {
			System.out.println(i + ": 홀수");
		}
		i++;
		
		if(i % 2 == 0) {
			System.out.println(i + ": 짝수");
		} else {
			System.out.println(i + ": 홀수");
		}

	}

}
