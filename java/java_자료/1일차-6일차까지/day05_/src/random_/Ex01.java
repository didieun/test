package random_;

import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		Random ran = new Random();
		int num = ran.nextInt(3); // 0 ~ 2
		System.out.println( "----" );
		
		for(int i=0 ; i<6 ; i++) {
			num = ran.nextInt(6); // 0 ~ 44
			System.out.println( num + 1 );
		}
		
		System.out.println( "----" );
		for(int i=0 ; i<5 ; i++) {
			double d = Math.random();
			// 0.0000 ~ 0.9999 * 3 = 0.000 ~ 2.9999
			System.out.println( (int)(d * 3) );
		}
		/*
		로또 프로그램
		list, set 이용
		45개의 숫자중 중복되지 않는 6개의 숫자 저장 후 출력
		*/
	}
}












