package com.yedam.java.ch0703;

public class Dog extends Animal{
	//오류이유 -> 추상메소드 오버라이딩 안해서 그럼
	
	 public Dog() {
		 this.kind = "포유류";
	 }

	@Override
	public void sound() {
		System.out.println("멍멍");
	}


}
