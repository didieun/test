package main;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 문제 1
		//    472 -- (1)
		// x  385 -- (2)
		// ------
		//   2365 -- (3)
		//  3776  -- (4)
		// 1416   -- (5)
		// ------
		// 181720 -- (6)
		
		// (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
		
		int a1 = input.nextInt();;
		int b1 = input.nextInt();;
		
		int c3 = b1 % 10;
		int c2 = (b1 / 10) % 10;
		int c1 = (b1 / 10) / 10;
		
		int d1 = a1 * c3;
		int e1 = a1 * c2;
		int f1 = a1 * c1;
		int g1 = d1 + (e1 * 10) + (f1 * 100);
		
		System.out.println(d1);
		System.out.println(e1);
		System.out.println(f1);
		System.out.println(g1);
		
		
		// 문제 2
		// 상근이는 매일 아침 알람을 듣고 일어난다. 알람을 듣고 바로 일어나면 다행이겠지만, 항상 조금만 더 자려는 마음 때문에 매일 학교를 지각하고 있다
		// 상근이는 모든 방법을 동원해보았지만, 조금만 더 자려는 마음은 그 어떤 것도 없앨 수가 없었다.	
		//	이런 상근이를 불쌍하게 보던 창영이는 자신이 사용하는 방법을 추천해 주었다.	
		//	바로 "45분 일찍 알람 설정하기"이다.
		//	이 방법은 단순하다. 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다. 어차피 알람 소리를 들으면, 알람을 끄고 조금 더 잘 것이기 때문이다. 이 방법을 사용하면, 매일 아침 더 잤다는 기분을 느낄 수 있고, 학교도 지각하지 않게 된다.
		//	현재 상근이가 설정한 알람 시각이 주어졌을 때, 창영이의 방법을 사용한다면, 이를 언제로 고쳐야 하는지 구하는 프로그램을 작성하시오.
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		int time = 0, c, d, e;
	
		if(a <= 0) {
			if(b >= 45) {
				time = b;
			} else {
				time = (24 * 60) + b;
			}
		} else {
			time = (a * 60) + b;
		}
		
		c = (time - 45) ;
		d = c / 60;
		e = c % 60;
		
		System.out.println(d + " " + e);
		
		// 문제 3
		// KOI 전자에서는 건강에 좋고 맛있는 훈제오리구이 요리를 간편하게 만드는 인공지능 오븐을 개발하려고 한다. 인공지능 오븐을 사용하는 방법은 적당한 양의 오리 훈제 재료를 인공지능 오븐에 넣으면 된다. 그러면 인공지능 오븐은 오븐구이가 끝나는 시간을 분 단위로 자동적으로 계산한다.
		// 또한, KOI 전자의 인공지능 오븐 앞면에는 사용자에게 훈제오리구이 요리가 끝나는 시각을 알려 주는 디지털 시계가 있다.
		// 훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.
		
		int aa = input.nextInt();
		int bb = input.nextInt();
		int mm = input.nextInt();
		int time2 = 0, cc, dd, ee;
		if(aa <= 0) {
			time2 = (24 * 60) + bb;
		} else {
			time2 = (aa * 60) + bb;
		}
		cc = time2 + mm;
		dd = cc / 60;
		ee = cc % 60;
		if(dd >= 24) {
			if(dd == 24) {
				dd = 0;
			} else {
				dd -= 24;
			}
		}
		System.out.println(dd + " " + ee);
		
		// 문제 4
		// 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
		// - 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
		// - 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
		// - 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
		// 예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
		// 3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
		
		int aaa = input.nextInt();
		int bbb = input.nextInt();
		int ccc = input.nextInt();
		
		int ddd = 0;
		
		if(aaa == bbb && bbb == ccc) {
			ddd = 10000 + aaa * 1000;
		} else if((aaa == bbb && aaa != ccc && bbb != ccc) || (aaa == ccc && aaa != bbb && bbb != ccc) || (bbb == ccc && aaa != bbb && aaa != ccc)) {
			if(aaa == bbb) {
				ddd = 1000 + aaa * 100;
			} else if (bbb == ccc){
				ddd = 1000 + bbb * 100;
			} else if(aaa == ccc){
				ddd = 1000 + ccc * 100;
			}
			
		} else {
			if(aaa > bbb && aaa > ccc) {
				ddd = aaa * 100;
			} else if(aaa < bbb && ccc < bbb){
				ddd = bbb * 100;
			} else if(ccc > aaa && ccc > bbb) {
				ddd = ccc* 100;
			}
		}
		
		System.out.println(ddd);
		
		// 문제 5
		// 별찍기 출력
		// 5입력시 아래와 같이 * 찍
		//     *
		//    **
		//   ***
		//  ****
		// *****
		int num = input.nextInt();
		for(int i = 1; i <= num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print(" ");
            }
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
            }
			System.out.println();
		}

	}

}
