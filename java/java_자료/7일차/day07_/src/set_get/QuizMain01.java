package set_get;

import java.util.Scanner;

public class QuizMain01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int age;
		System.out.println("이름 입력");
		name = input.next();
		System.out.println("나이 입력");
		age = input.nextInt();
		
		QuizSetGet01 q = new QuizSetGet01();
		q.setName(name);
		q.setAge(age);
		System.out.println(q.getName()+"님의 나이는 "+q.getAge()+"살 입니다");
		
	}
}
