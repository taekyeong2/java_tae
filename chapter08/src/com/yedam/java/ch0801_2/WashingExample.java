package com.yedam.java.ch0801_2;

public class WashingExample {
	public static void main(String[] args) {
		WashingMachine wm = new LGWashingMachine();
//		wm.startBtn();
//		System.out.println("세탁기 속도는: "+wm.changeSeed(3));
//		wm.startBtn();
		
		washing(new LGWashingMachine()); // 밑에 만든 메소드 호출
	}
	
	public static void washing(WashingMachine wm) {
		wm.startBtn();
		System.out.println("세탁기 속도는: "+wm.changeSeed(3));
		wm.startBtn();
	}
	
	//추상클래스 VS 인터페이스
	//추상클래스(extends) -> 필드 생성자 메소드 
	//한 자식은 하나의 부모만 섬김
	//공동필드를 사용할때, 생성자를 통해 초기화해야할때
	//인터페이스(implement) -> 상수 추상메소드 
	//부모자식이 아니라 객체여서 여러개 상속 가능(여러 인터페이스 계속 붙일 수 있음)
	//부모 클래스를 객체화 하지 않고 바로 구현 클래스 사용 가능
	// 필드 생성자 필요없이 기능위주로 구현해야할때
	
	}
