package com.yedam.java.ch0701;

public class Child extends Parent { //상속받을 클래스를 뒤에 적어준다. -> 부모의 필드,메소드 쓸수잇음
	//필드 
	public String lastName;
	public int age;
	//생성자
	
	//메소드
//	@Override 
//	public void method1() {
/// ====================== -> 이게 같아야함(동일한 시그니처)
//		System.out.println("자식 클래스 재정의된 메소드1호출");
//	}
	
	public void method3() {
		System.out.println("자식 클래스 메소드3 호출");
	}

	@Override
	public void method1() {
		System.out.println("자식 클래스 재정의된 메소드1호출");
	}
	
}
