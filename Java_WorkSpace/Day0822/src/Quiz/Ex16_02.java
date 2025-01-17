package Quiz;
// 16장.상속.pdf 강의교안의 20쪽 1번문제

class Parent { // extends Object이 생략됨.
	private int a;
			int b;
	protected int c;
	public int d;
} // Parent class

class Child extends Parent {
	public Child(int a, int b, int c, int d) {
//		this.a = a; // [1]번이 잘못됨(에러남). a 멤버변수가 private 접근제어자로 정의되어있어서 외부(자손)클래스에서 접근 못함.
		this.b = b; // [2]
		this.c = c; // [3]
		this.d = d; // [4]
	} // 생성자 오버로딩
	
	void print() {
//		System.out.println(a); // [5]번 잘못됨(에러남). a 멤버변수가 private 접근제어자로 정의되어있어서 외부(자손)클래스에서 접근 못함.
		System.out.println(b); // [6]
		System.out.println(c); // [7]
		System.out.println(d); // [8]
	}
	
}// Child 자손클래스

public class Ex16_02 {
	public static void main(String[] args) {
		Child child = new Child(1, 2, 3, 4);
		
		child.print();
//		System.out.println(child.a); // [9]번 잘못됨(에러남). a 멤버변수가 private 접근제어자로 정의되어있어서 외부(자손)클래스에서 접근 못함.
		System.out.println(child.b); // [10]
		System.out.println(child.c); // [11]
		System.out.println(child.d); // [12]
	}
}