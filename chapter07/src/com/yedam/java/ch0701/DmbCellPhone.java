package com.yedam.java.ch0701;

public class DmbCellPhone extends CellPhone {
	//필드
	public int channel;
	
	//생성자
	public DmbCellPhone(String model, String color, int channel) {
		//부모클래스 필드
		this.model = model;
		this.color = color;
		//자식클래스 필드
		this.channel = channel;
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널: "+ channel + "번 DMB방송 수신을 시작합니다.");
	}
}
