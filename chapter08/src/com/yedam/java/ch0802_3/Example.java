package com.yedam.java.ch0802_3;

public class Example {
	public static void main(String[] args) {
		
		ImplementationC impl = new ImplementationC();

		
		InterfaceA ia = impl;
		ia.methodA();
		
		InterfaceB ib = impl;
		ib.methodB();
		
		InterfaceC ic = impl;
		//상속 받아서 다 쓸수 있음.
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}
}
