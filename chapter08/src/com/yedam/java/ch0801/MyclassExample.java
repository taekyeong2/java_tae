package com.yedam.java.ch0801;

public class MyclassExample {
	public static void main(String[] args) {
		System.out.println("1)=======");
		Myclass mc = new Myclass();
		mc.rc.turnOn(); //mc(객체)안의 rc(객체)의 메소드 호출
		mc.rc.turnOff();

		System.out.println("2)=======");
		Myclass mc2 = new Myclass(new Audio());
//		rc.turnOn();
//		rc.turnOff();
	
		System.out.println("3)=======");
		Myclass mc3 = new Myclass();
		mc3.methodA();
//		rc.turnOn();
//		rc.turnOff();
		
		System.out.println("4)=======");
		Myclass mc4 = new Myclass();
		mc4.methodB(new Television());
//		rc.turnOn();
//		rc.turnOff();

	
	
	}
}
