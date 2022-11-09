package com.yedam.java.ch0602;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car(); // 클래스 호출을 위해서는 new연산자 사용해서 인스턴스 생성
		
		//자바에서 만들 수 있는 모든 클래스는 오브젝트 클래스에 속함(상속관계 부모 자식) 
		System.out.println("제작회사 :"+ myCar.company);
		System.out.println("모델명 : "+ myCar.model);
		System.out.println("색깔 : "+ myCar.color);
		System.out.println("최고속도 : "+ myCar.maxSpeed);
		System.out.println("현재속도 : "+ myCar.speed); 
		
		myCar.speed = 60;  //인스턴스는 고유의 값 가질 수있음.
		System.out.println("수정된 속도 : "+ myCar.speed); 
		
		//새로운 인스턴스 만들기
		Car newCar = new Car(); //클래스가 들고 있는 디폴트값 들고있음
		System.out.println("새로운 차 현재속도 : "+ newCar.speed); 
		
		String str = new String("Con"); 
		
				
		
		
		
		
		
	
	
	
	}
}
