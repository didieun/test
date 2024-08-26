// 과제물) UML 클래스 다이어그램( 클래스 설계도면)을 참조해서 12장 메서드 살피기. pdf 20쪽 문제에 대한 답안 코드를 작성해 보세요.

class Mp3{
	private String comp;
	private int size;
	
	public String getComp() {
		return comp;
	}
	public void setComp(String comp) {
		this.comp = comp;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
}

public class Ex12_02 {

	public static void main(String[] args) {

		Mp3 mp3 = new Mp3();
		
		mp3.setComp("갑을회사");
		mp3.setSize(8);
		
		String comp = mp3.getComp();
		int size = mp3.getSize();
		
		System.out.println("회사명: " + comp); 
		System.out.println("메모리 용량: " + size + "G");
		
	}

}
