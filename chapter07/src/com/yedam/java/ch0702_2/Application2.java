package com.yedam.java.ch0702_2;

public class Application2 {
	public static void main(String[] args) {
		
		HankookTire hTire = new HankookTire("right", 10);
		KumhoTire kTire = new KumhoTire("left", 20);
		
		//Tire객체에 자식 객체인 hTire를 넣어줌
		// -> 내걸(부모타입) 쓰고 있지만 오버라이딩 된건 한국타이어것을 쓴다.
		Tire tire = hTire;
		System.out.println(tire.roll());

		tire = kTire;
		System.out.println(tire.roll());
				
		tire = hTire;
		System.out.println(tire.roll());
		
		//하나의 타입(부모 클래스)로 다양한 결과 -> 다형성
	}
}
