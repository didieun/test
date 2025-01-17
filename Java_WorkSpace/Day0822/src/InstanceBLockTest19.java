// 인스턴스 초기화 블록 {}을 사용해서 정적변수와 인스턴스 변수 초기화
class Product {
	static int count = 0; // 정적변수, 생성된 객체수를 저장할 변수(총 생산된 제품수)
	int serialNumber = 0; // 인스턴스 변수, 생성된 객체마다 별도로 저장하는 제품고유번호(시리얼번호)
	
	{
		++count; // 먼저 1증가 즉 선행증가한 누적카운터 -> 총 생산된 제품수
		serialNumber = count;
	} // 인스턴스 초기화 블록을 사용해서 정적변수와 인스턴스 변수를 함께 초기화
	
	public Product() {} // 기본생성자 -> 생략해도 묵시적 제공
}// Product class

public class InstanceBLockTest19 {

	public static void main(String[] args) {
		Product p01 = new Product();
		Product p02 = new Product();
		Product p03 = new Product();
		
		System.out.println("p01의 제품번호(시리얼 고유번호)는 " + p01.serialNumber);
		System.out.println("p02의 제품번호(시리얼 고유번호)는 " + p02.serialNumber);
		System.out.println("p03의 제품번호(시리얼 고유번호)는 " + p03.serialNumber);
		System.out.println("총 생산된 제품수는 " + Product.count); //클래스명.정적변수로 접근한다.
	}
}