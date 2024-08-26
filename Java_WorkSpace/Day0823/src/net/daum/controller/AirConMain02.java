package net.daum.controller;

import net.daum.model01.AirCon;
import net.daum.model02.AirModel01;
import net.daum.model02.AirModel02;
import net.daum.model02.AirModel03;

/*
 *	하나는 매개변수 다형성 문법이 적용안된것과 적용된 예제소스
 *	매개변수 다형성 문법을 적용할려면 상속, 업캐스팅등(메서드 오버라이딩 등)이 적용되어야 한다.
 */

public class AirConMain02 {
	
	static void inCome(AirModel01 air) { // 매개변수(전달인자) 타입을 다르게 한 메서드 오버로딩
		air.goods_in();
	}
	
	static void inCome(AirModel02 air) { // 매개변수(전달인자) 타입을 다르게 한 메서드 오버로딩
		air.goods_in();
	}
	
	static void inCome(AirModel03 air) { // 매개변수(전달인자) 타입을 다르게 한 메서드 오버로딩
		air.goods_in();
	} // 매개변수 다형성 문법을 적용하지 않으면 자손클래스 개수만큼 메서드를 오버로딩을 해야 한다. 그만큼 불필요한 코드라인이 추가된다.
	
	static void inCome2(AirCon air) { // 매개변수 타입이 부모타입 AirCon이여서 업캐스팅이 적용되어서 모든 자손타입을 받을 수 있다. -> 매개변수 다형성
		air.goods_in(); // 업캐스팅 이후 오버라이딩 한 메서드 호출
	}
	
	public static void main(String[] args) {
		inCome(new AirModel01());
		inCome(new AirModel02());
		inCome(new AirModel03());
		System.out.println("==========================>");
		inCome2(new AirModel01());
		inCome2(new AirModel02());
		inCome2(new AirModel03());
	}
}