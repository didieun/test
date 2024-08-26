package net.daum.controller;

import net.daum.vo.MemberVO;

public class MemberController {

	public static void main(String[] args) {
		MemberVO member = new MemberVO();
		
		member.setMem_id("kkkkk"); // 회원 아이디 저장
		member.setMem_pwd("77777"); // 회원 비번 저장
		member.setMem_name("홍길동"); // 회원 이름 저장
		member.setMem_email("kkkkk@daum.net"); //회원 메일주소 저장
		member.setMem_phone("010-9999-9999");  // 회원 연락처 저장
		
		System.out.println("아이디: " + member.getMem_id()); // 아이디 출력
		System.out.println("회원이름: " + member.getMem_name()); // 이름 출력
		System.out.println("이메일: " + member.getMem_email()); // 이메일 출력
		System.out.println("연락처: " + member.getMem_phone()); // 연락처 출력 
			
	}
}