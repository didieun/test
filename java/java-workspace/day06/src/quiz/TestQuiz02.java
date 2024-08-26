package quiz;

import java.util.Scanner;

public class TestQuiz02 {

	public String[] inputName() {
		Scanner input = new Scanner(System.in);
		String[] nameList = new String[3];
		
		for(int i = 0; i < nameList.length; i++) {
			System.out.print("이름 입력: ");
			String name = input.next();
			nameList[i] = name ;
		}
		
		return nameList;
	}
	
	public void printName(String[] nameList) {
		System.out.println();
		System.out.println("----- 이름 출력 -----");
		for(int i = 0; i < nameList.length; i++) {
			System.out.println((i + 1) + ". 이름: " + nameList[i]);
		}
	}
}
