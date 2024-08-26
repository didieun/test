package quiz;

import java.util.Scanner;

public class TestQuiz01 {
	public String inputName() {
		Scanner input = new Scanner(System.in);
		System.out.print("이름 입력: ");
		String name = input.next();
		
		return name;
	}
	
	public void printName(String name) {
		System.out.println("이름은 " + name + "입니다.");
	}
}
