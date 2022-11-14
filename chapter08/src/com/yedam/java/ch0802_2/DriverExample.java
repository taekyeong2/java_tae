package com.yedam.java.ch0802_2;

public class DriverExample {
	public static void main(String[] args) {
		//매개변수 다형성
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
	
//		driver.drive(bus);		
//		driver.drive(taxi);
		
		//자동타입변환
		Vehicle vhc = new Bus();
		
		vhc.run();
		//vhc.checkFare(); -> 구현클래스 내부 메소드여서 오류
		
		//강제타입변환
		Bus bus2 = (Bus) vhc;
		
		bus2.run();
		bus2.checkFare();
		
		System.out.println();
		
		//객체 타입 확인
		//instanceof
		driver.drive(bus);		
		driver.drive(taxi);
		
		
		
		
		
	}
}
