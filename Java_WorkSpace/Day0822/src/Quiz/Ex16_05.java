package Quiz;
//16장.상속.pdf 강의교안의 26쪽 4번문제

class HandPhone {
	protected String model;
	protected String number;
	
	public HandPhone() {}
	public HandPhone(String model, String number) {
		this.model = model;
		this.number = number;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getNumber() {
		return number;
	}
} // HandPhone 부모 클래스

class DicaPhone extends HandPhone {
	protected String pixel;
	
	public DicaPhone() {}
	public DicaPhone(String model, String number, String pixel) {
		super(model, number);
		this.pixel = pixel;
	}
	
	public void prnDicaPhone() {
		System.out.println("모델명: " + getModel() + "\t번호: " + getNumber() + "\t화소수: " + pixel );
	}
}// 자손클래스 DicaPhone

public class Ex16_05 {
	public static void main(String[] args) {
		DicaPhone dp = new DicaPhone("갤럭시", "010-0000-0000", "1024");
		dp.prnDicaPhone();
	}
}