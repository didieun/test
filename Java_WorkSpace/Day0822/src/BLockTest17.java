/*	초기화 블록)
 *	1. 생성자의 주된 기능은 클래스 소속 멤버변수 중 인스턴스 변수 초기화이다.
 *	2. 초기화란 변수정의하고 최초값을 저장하는 것을 말한다.
 *	3. 클래스 초기화 블록 특징
 *	   가. 정적변수(클래스변수)의 복작한 초기화에 사용된다.
 *	   나. 해당 클래스가 메모리에 로딩될 때 딱 한번만 수행한다.
 *	4. 인스턴스 초기화 블록 특징
 *	   가. 인스턴스 변수의 복잡한 초기화에 사용된다.
 *	   나. 인스턴스 초기화 블록은 생성자와 같이 인스턴스(객체)를 생성할 때 마다 수행한다.
 *     다. 생성자 보다 인스턴스 초기화블록이 먼저 수행한다.	
 */

public class BLockTest17 {
	
	static {
		System.out.println("static {}");
	} // 클래스 초기화 블록 - 처음 한번만 수행
	
	{
		System.out.println("{}");
	} // 인스턴스 초기화 블록 - 생성자 보다 먼저 수행
	
	public BLockTest17() {
		System.out.println("기본생성자 BLockTest17()");
	} // 기본생성자
	
	public static void main(String[] args) {
		new BLockTest17();
		new BLockTest17();
	}
}