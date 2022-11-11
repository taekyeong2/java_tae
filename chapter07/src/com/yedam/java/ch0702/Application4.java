package com.yedam.java.ch0702;

public class Application4 {
	public static void main(String[] args) {
		//상속관계
		B b = new B();
		C c = new C();
		// c -> b
		// b -> a
		// c -> b -> a
		
		//자동타입변환
		A a1 = b;
		A a2 = c;  // c -> a
		
	}
}
