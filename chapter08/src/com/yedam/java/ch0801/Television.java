package com.yedam.java.ch0801;

public class Television implements RemoteControl, Search{
	//인터페이스 안에 있는 메소드 다 오버라이딩 해야한다.
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");		
	}

	@Override
	public void setVolume(int abstractoulume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: "+ this.volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다."); 
	}  
	
}
