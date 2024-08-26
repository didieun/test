package downcasting;

// instanceof는 형변환 유무 판단 연산자이다.

class HandPhone { // extends Object 이 생략되었다.
	String model; // 폰모델
	String number; // 폰번호
	
	public HandPhone() {}
	public HandPhone(String model, String number) {
		this.model = model;
		this.number = number;
	} // 생성자 오버로딩
} // HandPhone class 부모 클래스

class DicaPhone extends HandPhone {
	String pixel; // 화소수
	
	public DicaPhone() {}
	public DicaPhone(String model, String number, String pixel) {
		super(model, number); // 부모클래스 오버로딩 된 생성자를 호출
		this.pixel = pixel;
	}
	
	public void prnDicaPhone() {
		System.out.println("폰모델: " + model + ", 폰번호: " + number + ", 화소수: " + pixel);
	}
} //  DicaPhone class 자손클래스

public class InstanceOf05 {
	public static void main(String[] args) {
		DicaPhone dp = new DicaPhone("갤럭시 24", "010-7777-7777", "1024");
		dp.prnDicaPhone();
		
		if(dp instanceof DicaPhone) { // dp 객체가 DicaPhone 객체 타입인가? 맞으면 true, 틀리면 false
			System.out.println("dp는 DicaPhone이다.");
		}
		
		if(dp instanceof HandPhone) { // 업캐스팅이 가능한가?
			HandPhone hp = dp; //  업캐스팅
			System.out.println("업캐스팅이 가능하다.");
		}
		
		HandPhone hp2 = new HandPhone(); // 사전에 업캐스팅 안함. -> 다운캐스팅 허용 안함.
		if(hp2 instanceof DicaPhone) { // hp2가 다운캐스팅이 가능한가? -> 사전에 업캐스팅을 하지 않아서 불가능(false) :  제일중요!!!!
			DicaPhone dp2 = (DicaPhone)hp2; // 명시적인 다운캐스팅
			System.out.println("다운캐스팅이 가능하다.");
		} else {
			System.out.println("다운캐스팅이 불가능하다.");
		}// if else
		
	}
}