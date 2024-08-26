package common;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("1.온오프");
			System.out.println("2.바람세기");
			System.out.println("3.온도설정");
			num = input.nextInt();
			switch (num) {
			case 1:break;
			case 2:break;
			case 3:break;
			}
		}
	}
}
