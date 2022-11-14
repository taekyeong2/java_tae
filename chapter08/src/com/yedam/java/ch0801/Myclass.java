package com.yedam.java.ch0801;

public class Myclass { //인터페이스 적용방법
	// 필드
	//public int a = 1;
	//1)
	RemoteControl rc = new Television();
	
	//생성자 - 오버로딩
	public Myclass(){
		
	}
	
	//2)
	public Myclass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.turnOff();
	}
	
	//메소드
	//3)
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}
	
	void methodB(RemoteControl rc) {
		//매개변수에 Audio, 나  Television 넣어 쓸수 있다.
		rc.turnOn();
		rc.turnOff();
	}
	
}
