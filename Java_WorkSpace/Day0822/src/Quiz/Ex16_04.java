package Quiz;
//16장.상속.pdf 강의교안의 24쪽 3번문제

class Animal {
	protected String kind;
	protected int leg;
	
	public Animal() {}
	public Animal(String kind, int leg) {
		this.kind = kind;
		this.leg = leg;
	} // 생성자 오버로딩
	
	public void getKind() {
		if(kind.equals("강아지")) { // 문자열 값 같다 비교는 .equals()메서드를 사용한다.
			System.out.println(kind + "동물이다");
		} else {
			System.out.println(kind + "사람이다");
		}
	}
	
	public void walk() {
		if(kind.equals("강아지")) {
			System.out.println(kind + "는 " + leg + "발로 걷는다");
		} else {
			System.out.println("사람은" + leg + "발로 걷는다");
		}
	}
}// 부모클래스 Animal class

//첫번째 자손클래스 Dog
class Dog extends Animal {
	public Dog() {}
	public Dog(String kind, int leg) {
		super(kind, leg); // 부모클래스 오버로딩 된 생성자 호출
	}
}// Dog class

// 두번째 자손클래스 Human
class Human extends Animal {
	public Human() {}
	public Human(String kind, int leg) {
		super(kind, leg); 
	}
}// Human class

public class Ex16_04 {
	public static void main(String[] args) {
		Dog d = new Dog("강아지", 4);
		Human h = new Human("소녀", 2);
		
		d.getKind();
		d.walk();
		h.getKind();
		h.walk();
	}
}