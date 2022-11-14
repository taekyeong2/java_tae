package com.yedam.java.ch0802;

public class CarExample {
	public static void main(String[] args) {
		//필드의 다형성
		Car myCar = new Car();
		
		myCar.run();
		
		System.out.println("====================");
		
		myCar.frontLeftTire = new MichelinTire();
		myCar.frontRightTire = new MichelinTire();

		myCar.run();
		
	}
}
