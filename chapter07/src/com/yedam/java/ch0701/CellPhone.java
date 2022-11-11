package com.yedam.java.ch0701;

public class CellPhone {
	//필드 
	public String model;
	public String color;
	
	//생성자
	
	//메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	void sendVoice(String message) {
		System.out.println("자기 : "+ message);
	}
	void receiveVoice(String message) {
		System.out.println("상대방 : "+ message);
	}
}
