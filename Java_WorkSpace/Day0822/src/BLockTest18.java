/*	static 키워드로 정의된 정적배열을 클래스 초기화블록 static{}을 사용해서
 *	배열원소값을 초기화를 하는 예제
 */

public class BLockTest18 {
	
	static int[] arr = new int[10]; // 배열크기가 10인 정적배열 arr생성
	
	static {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1; // Math.random()은 0.0이상 1.0미만 사이의
			// 실수 숫자 난수 발생 -> * 10 하면 0.0이상 10.0미만 -> (int)로 형변환 즉 캐스팅하면 소수점이하는
			// 버리고 0이상 10미만 사이의 정수 숫자만 구함 -> + 1 하면 1이상 11미만 사이의 정수숫자 난수가
			// arr배열원소값으로 저장
		}
	} // 클래스 초기화블록에서 정적배열 원소값 저장
	
	public static void main(String[] args) {

		// 자바5에서 추가된 향상된 확장 for 반복문으로 배열원소값을 출력
		for(int k : arr) {
			System.out.print(k + " ");
		}
	}
}