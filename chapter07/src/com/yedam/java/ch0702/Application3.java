package com.yedam.java.ch0702;

public class Application3 {	
	
	public static void method1(Parent parent) {
		//무엇을 참조해서 만들었나?
		if(parent instanceof Child) {  
	  //   ======객체         ======클래스(타입)
			Child child = (Child)parent;
			System.out.println("method1 - child 변환 성공");
		}else {
			System.out.println("변환 실패");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 child변환 성공");
		
	}
	
	public static void main(String[] args) {
		//객체타입확인
		Parent parentA = new Child();
		//parentA는 Parent의 타입이지만 Child()를 참조해서 만든 객체임 -> 오버라이딩 정보 가죠옴
		method1(parentA);
		
		//강제타입변환 오류 -> ? 책 352
		Parent parentA = new Child();
		method1(parentA);
		
		Parent parentB = new Parent();
		method2(parentB);
		

		System.out.println();

		
		//매개변수의 다형성
		Driver driver = new Driver();
		
		//bus,taxi -> vehicle부모 클래스 모심
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//driver, driver(Vehicle vehicle = new Bus())
		//부모타입객체에 자식타입객체가 들어가서 자동타입변환
		//자식이 오버라이딩 메소드 있으면 실행
		driver.drive(bus);
		driver.drive(taxi);
		
		//부모타입 객체 = 자식타입 객체
		// 부모타입에 자식타입을 넣어줘서
		//-> 부모타입의 내용(규격)에 자식타입 오버라이딩 내용을 가진다.
		// 자식타입객체 아닌걸 넣어주면 어케됨?
		
		System.out.println();
		
		//부모클래스(자식보다 넓은 범위 - 동물) 
		//-> 공통된 특징 너어줌(speak)
		Animal animal = null;
		
		//여러 동물들 (고양이 개)
		//-> 자식개체들의 각각 특징으로 다르게 (야옹 멍멍) 표현가능
		//->다형성
		animal = new Cat();
		animal.spreak();
		
		animal = new Dog();
		animal.spreak();
		
		System.out.println();
		
		Parent parent = new Child();
		
		parent.field = "parent";
		parent.method1();
		parent.method2();
		
		//parent.field2 = "child";
		//parent.method3();
		
		//Casting(강제타입변환) 
		// -> 기존에 쓰던것(부모것) + 자식것 같이 쓸수 있다.
		Child child = (Child)parent;
		child.field2 = "child";
		child.method3();
		child.field = "parent";
		


		
		
		
		
		
		
		
	}
}
