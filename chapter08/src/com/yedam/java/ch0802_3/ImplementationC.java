package com.yedam.java.ch0802_3;

public class ImplementationC implements InterfaceC{
	//C가 상속한 A,B의 메소드 다 재정의 해줘야함

	@Override
	public void methodA() {
		System.out.println("method A 실행");
	}

	@Override
	public void methodB() {
		System.out.println("method B 실행");
	
	}

	@Override
	public void methodC() {
		System.out.println("method C 실행");

	}

}
