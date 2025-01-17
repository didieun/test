package constructor;

import java.util.ArrayList;

class TestClass03{
	
	ArrayList<String> arr; // = new ArrayList<>();
	
	public TestClass03() {
		arr = new ArrayList<>();
		// 어떤값을 초기화 할려면 생성자 안에 초기화 하면 된다.
		if(true) {
			arr = new ArrayList<>();
		}
	}
}

class TestDTO{
	private int k, e, m;

	
	public TestDTO() {}
	
	public TestDTO(int k, int e, int m) {
		this.k = k;
		this.e = e;
		this.m = m;
	}
	
	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}
}

public class MainClass03 {

	public static void main(String[] args) {
		
		TestClass03 t = new TestClass03();
		
		int k = 100, e = 90, m = 80;
		
		TestDTO dto = new TestDTO();
		dto.setK(k);
		dto.setE(e);
		dto.setM(m);
		System.out.println("국어: " + dto.getK());
		System.out.println("영어: " + dto.getE());
		System.out.println("수학: " + dto.getM());
		
		System.out.println();
		
		// 생성자로 값 넣기(생성자로 바로 초기화)
		TestDTO dto2 = new TestDTO(k, e, m);
		System.out.println("국어2: " + dto2.getK());
		System.out.println("영어2: " + dto2.getE());
		System.out.println("수학2: " + dto2.getM());
		
	}

}
