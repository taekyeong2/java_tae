package com.yedam.java.ch0603;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("모닝","하늘색");
		System.out.println("제조회사 : "+myCar.company);		
		System.out.println("모델명 : "+myCar.model);		
		System.out.println("색깔 : "+myCar.color);	
		//클래스는 여전히 고유한 값을 들고 있음. 
		
//		Car newCar = new Car();  -> 이미 생성자가 있는데(public Car(String model, String color)) 자바가 임의로 기본생성자를 만들수는 없음
//		                            클래스가 생성자가 없을때 자바가 기본 생성자를 만든다.
		Car newCar = new Car(); // 클래스에 새로운 생성자를 추가한 뒤
		System.out.println("제조회사 : "+newCar.company);		
		System.out.println("모델명 : "+newCar.model);		
		System.out.println("색깔 : "+newCar.color);	
		
		Car subCar = new Car("아이오닉","하얀색");
		System.out.println("제조회사 : "+subCar.company);		
		System.out.println("모델명 : "+subCar.model);		
		System.out.println("색깔 : "+subCar.color);	
		
	}
}
