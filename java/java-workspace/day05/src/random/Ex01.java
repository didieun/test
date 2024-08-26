package random;

import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		Random ran = new Random();
		int num = ran.nextInt(3); // 0~2까지 총3개의 숫자를 뽑아오겠다라는 의미 
		System.out.println(num);
		
		for(int i = 0; i < 5; i++) {
			num = ran.nextInt(3); // 0~2
			System.out.println(num + 10);
		}
		
		for(int i = 0; i < 5; i++) {
			double d = Math.random();  // .random : 0.0000 ~ 0.9999 double 형태의 값 랜덤
			// 0.0000 ~ 0.9999 * 3 = 0.000 ~ 2.999 값이 나
			System.out.println((int)(d * 3));  // 3개의 값만 뽑고 같으면 (int)로 형변환 
		}
		
	}

}
