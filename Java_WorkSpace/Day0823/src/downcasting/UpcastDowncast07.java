package downcasting;
// 레퍼런스 간의 형변환에서 업캐스팅과 다운캐스팅을 알아보는 예제
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

public class UpcastDowncast07 {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		Car car = fe; // 업캐스팅
		car.drive();
		car.stop();
		
		FireEngine fe2 = (FireEngine) car; // 명시적인 다운캐스팅
		fe2.water();
		
		// instanceof 활용
		if(car instanceof FireEngine) {
		 	FireEngine fe3 = (FireEngine) car; // 명시적인 다운캐스팅
			fe3.water();
		} else {
			System.out.println("다운캐스팅 불가능");
		}
	}
}