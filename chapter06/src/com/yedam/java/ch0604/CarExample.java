package com.yedam.java.ch0604;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		/*
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		*/
		
		myCar.run();  //-> 내부 메소드 조합
		
		
	}
}
