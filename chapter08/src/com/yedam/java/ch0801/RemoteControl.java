package com.yedam.java.ch0801;

public interface RemoteControl {  
//     =========	
	
	//인터페이스(기본설계도)  /cf)추상클래스(미완성설계도)
	//상속받는 것을 구현 객체, 자식 클래스를 구현 클래스
	//대규모 프로젝스 -> 번역
	//A: 영어 -> 한글 (메소드 : 번역)
	//B: 영어 -> 일본어 ( 메소드 : method1())
	//C: 영어 -> 중국어 ( 메소드 : mehtod2())
	
	//프로젝스 완료 -> 똑같은 메소드 이름으로 구현
	
	//상수
	//public static final PI = 3.14;
		
	//추상메소드
	//public abstract void method1();
	
	//========================================
	
	 //상수
	 //public (static final) int ...;
	 public int MAX_VOLUME = 10;
	 public int MIN_VOLUME = 10;  // 인터페이스는 알아서 (static final)타입 가진다. (생략)
	 
	 //추상메소드  -> 미리 만들어놓을 코드를 다 정의해 놓기 때문에 기본설계도가 됨
	 //public (abstract) void ...(); ->abstract 생략 가능
     public void turnOn();
     public void turnOff();
     public void setVolume(int volume);
	
}
