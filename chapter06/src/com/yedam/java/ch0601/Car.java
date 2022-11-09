package com.yedam.java.ch0601;
//실행클래스(main이 없다) vs 라이브러리 클래스(main이 있고 실행됨)
public class Car {  //하나의 파일은 하나의 클래스를 가진다.
	//필드 : 속성
	int maxSpeed = 100;
	String color = "red";
	
	//생성자(초기값)
	public Car() { //생성자는 클래스와 이름이 같다. 본인의 이름 가질수 없음. 리턴값 존재 ㄴㄴ
		System.out.println("자동차가 출하되었습니다.");
	}
	
	//메소드 : 동작
	public void run() { //메소드는 본인의 이름이 존재하고 리턴되는 값 필요
		System.out.println("자동차가 동작 중입니다.");
	}
	
	
}
