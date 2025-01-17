/*
 *	this()는 같은 클래스내의 오버로딩된 다른 생성자를 호출한다. this()는 상속과 관련없다.
 *	인스턴스 초기화 블록 {}과 클래스 초기화 블록인 static{}을 사용하지 않고 생성자를 통한 초기화를 한다.
 */

class Document {
	static int count = 0;
	String name; // 문서명
	
	Document() {
		this("제목없음" + ++count); // 같은 클래스내의 다른생성자를 호출
	} // 기본생성자
	
	Document(String name) {
		this.name = name;
		System.out.println("문서: " + this.name + "이 생성되었습니다.");
	} // 생성자 오버로딩
}

public class ThisConsTest20 {
	public static void main(String[] args) {
		Document d01 = new Document();
		new Document("자바.txt");	 // 오버로딩 된 생성자 호출
		new Document();
	}
}