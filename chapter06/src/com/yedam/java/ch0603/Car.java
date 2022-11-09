package com.yedam.java.ch0603;

public class Car {
	//필드
	String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 350;
	int speed; 
	
	//생성자
	public Car(String model, String color) { //(내부 필드)
		//this -> 이 클래스로 형성되는 인스턴스를 가리킨다.(생성자 호출하는 것 자체가 인스턴스 만드는것)
		//        인스턴스 생성하고 그것이 들고있는 값을 대체하는것.
		//        생성자, 메소드 안에서만 정상적으로 작동.
		this.model = model;  
		this.color = color;
	}
	public Car() {};
}
