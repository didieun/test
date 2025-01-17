package net.daum.controller;

import net.daum.model01.AirCon;
import net.daum.model02.AirModel01;
import net.daum.model02.AirModel02;
import net.daum.model02.AirModel03;

public class AirConMain {
	public static void main(String[] args) {
		
		// 가장 일반적인 형태
		AirModel01 air01 = new AirModel01();
		AirModel02 air02 = new AirModel02();
		AirModel03 air03 = new AirModel03();
		
		air01.goods_in();
		air02.goods_in();
		air03.goods_in();
		
		System.out.println("\n--------------------------->\n");
		
		// 업캐스팅
		AirCon air;	// 부모 추상클래스 타입으로 참조 변수 선언
		
		air = new AirModel01(); // 첫번째 자손을 업캐스팅
		air.goods_in(); // 업캐스팅 이후 오버라이딩 한 메서드 호출
		
		air = new AirModel02();
		air.goods_in();
		
		air = new AirModel03();
		air.goods_in();
		
		System.out.println("\n--------------------------->\n");
		
		// 추상클래스는 객체 생성이 안되지만 배열로하면에러가 안남. 잘 사용안함
		AirCon[] arr = new AirCon[3]; // 배열 크기가 3인 arr 객체배열을 생성
		arr[0] = new AirModel01();	// 업캐스팅
		arr[1] = new AirModel02();
		arr[2] = new AirModel03();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].goods_in(); // 업캐스팅 이후 오버라이딩 한 메서드를 호출
		}
		
		System.out.println("\n--------------------------->");
	
	}
}