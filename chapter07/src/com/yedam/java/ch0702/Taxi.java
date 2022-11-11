package com.yedam.java.ch0702;

public class Taxi extends Vehicle{

	@Override // @ => 자바가 오버라이딩 한걸 미리 알려줌 / 없으면 작업하다가 자바가 나중에 암
	public void run() {
		System.out.println("택시가 달립니다.");
	}
 
}
