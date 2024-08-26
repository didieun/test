// 상속코드에서 코드의 재활용
class Point2D extends Object { // extends Object 은 묵시적 생략가능함.
	private int x;
	private int y;
	
	// 매개변수(전달인자)가 없는 기본 생성자 묵시적 제공
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}// Point2D class

class Point3D extends Point2D {
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
}// 자손 클래스 Point3D

public class BreakTest10 {

	public static void main(String[] args) {

		Point3D pt = new Point3D();
		pt.setX(100);	// 상속받아서 호출
		pt.setY(200);	// 상속받아서 호출
		pt.setZ(300);   // 자기자신 클래스 호출
		
		System.out.print("x좌표값: " + pt.getX() + ", y좌표값: " + pt.getY() + ", "); // 상속받아서 값 출력
		System.out.println("z좌표값: " + pt.getZ());  // 자기자신 클래스 호출
		
		
	}

}