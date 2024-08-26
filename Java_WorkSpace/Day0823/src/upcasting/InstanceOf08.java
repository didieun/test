package upcasting;
// Car 부모클래스와 FireEngine 자손클래스를 활용한 instanceof 형변환 유무 판단연산자에 관한 실습이다.
class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("차가 드라이브 한다.");
	}
	
	void stop() {
		System.out.println("차가 멈춘다.");
	}
} // 부모 Car class

class FireEngine extends Car {
	void water() {
		System.out.println("소방차가 물을 뿌린다.");
	}
} // 자손 FireEngine class

public class InstanceOf08 {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("fe가 FireEngine 이다.");
		}
		
		if(fe instanceof Car) { // fe 가 Car 부모타입으로 업캐스팅이 가능한가?
			System.out.println("업캐스팅이 가능하다.");
		}
		
		// 많이 사용됨
		if(fe instanceof Object) { // fe 가 Object 타입으로 업캐스팅이 가능한가?
			System.out.println("fe가 Object타입으로 업캐스팅이 가능하다.");
		}
		
		System.out.println(fe.getClass().getName()); // fe 타입 패키지명.해당클래스명을 출력한다.
	}
}