package net.daum.vo;

public class MemberVO {	// 중간에 자료를 저장하는 데이터 자장 bin 클래스
	
	private String mem_id; // 회원아이디
	private String mem_pwd; // 회원비번
	private String mem_name; // 회원이름
	private String mem_email; // 메일주소
	private String mem_phone; //폰번호
	
	// 기본생성자 묵시적 제공
	
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_pwd() {
		return mem_pwd;
	}
	public void setMem_pwd(String mem_pwd) {
		this.mem_pwd = mem_pwd;
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public String getMem_email() {
		return mem_email;
	}
	public void setMem_email(String mem_email) {
		this.mem_email = mem_email;
	}
	public String getMem_phone() {
		return mem_phone;
	}
	public void setMem_phone(String mem_phone) {
		this.mem_phone = mem_phone;
	}
}
