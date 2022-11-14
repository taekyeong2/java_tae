package com.yedam.java.ch0801;

public class RemoteExample {
	public static void main(String[] args) {
		
		//하나의 인터페이스로 다양한 객체 / 인터페이스 자신을 객체화 x
		//TV를 객체로 해서 만듦.
		RemoteControl rc = new Television();
		
		//Audio를 객체로 해서 갈아끼움
		//rc라는 하나의 객체로 다양한 기능 실행 가능
        //rc = new Audio();
		
		rc.turnOn();
		rc.setVolume(11);
		rc.turnOff();
		
		//쓰고싶은 기능이 있음 하나더 만들어야한다.
		Search search = new Television();
		//똑같은 텔레비젼이지만 어떤 인터페이스를 부르냐에 따라 기능이 다르다.
		search.search("google.com");
		
		//자기자신만 활용한 하나의 객체
		//다른 기능이 필요하면 더 객체를 만들어야함
		Television tv = new Television();
		
		tv.turnOn();
		tv.setVolume(11);
		tv.turnOff();
		

		
		
	}
}
