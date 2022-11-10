package com.yedam.java.ch0605;

public class Singleton {
	
	//전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 코딩기법
	private static Singleton singLeton = new Singleton(); // -> 안필요해도 무조건 하나 만들고 시작히겟다.
//  ====================================================  -> 단하나의 객체
    // -> 싱글톤이라는 타입. 뉴 연산자를 통해 만들어서 그 주소값을 변수에
	//   singleton = new Singleton()
	private Singleton() {
	}  // private를 이용해 생산자를 막아 밖에서 객체 못만들게끔 막음
	
	public void run() {
		System.out.println("싱글톤이 작동중입니다.");
	}  // 단하나의 객체 만들어 주고 이 클래스에 내가 자주쓰는 기능들 넣어줌 -> 그리고 원하는 기능 불러줌
	//ex) s1.run();
	
	public static Singleton getInstance() {
		return singLeton;
	  //       ========= = new Singleton()
	} // 메소드 이용해 단 하나의 객체 호출(리턴)(new Singleton()의 주소값)
	//  getInstance() == singleton == new Singleton()
	
	
	   
	//======================================================================================
	
	/*
	private static Singleton singLeton = null; 
	private Singleton() {
	}  
	
	// 싱글톤 한번 불리면 그때서야 만들겠다. -> 필요할때만 싱글톤 만들겠다.
	public static Singleton getInstance() {
		if(singLeton == null) {
			return singLeton = new Singleton();
		}else {
			return singLeton;
		}
	*/
	}


