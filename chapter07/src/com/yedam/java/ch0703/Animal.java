package com.yedam.java.ch0703;

public abstract class Animal {
	public String kind;

	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	//추상메소드 -> 같은 용도의 같은 메소드명이 필요할때
	public abstract void sound(); // 무조건 오버라이딩 해야함
	
}
