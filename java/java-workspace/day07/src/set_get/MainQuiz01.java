package set_get;

import java.util.Scanner;

public class MainQuiz01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String name; int age;
		
		System.out.print("이름 입력: ");
		name = input.next();
		
		System.out.print("나이 입력 : ");
		age = input.nextInt();
		
		TestQuiz01 t = new TestQuiz01();
		t.setName(name);
		t.setAge(age);
		
		System.out.println("----- 정보 -----");
		name = t.getName();
		System.out.println("이름: " + name);
		System.out.println("입력나이: " + age);
		age = t.age();
		System.out.println("만 나이: " + age);
		

	}

}
