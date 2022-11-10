package com.yedam.java.ch06;

public class Game {
	//필드
	//생성자를 가지고 객체로 만든다. (인스턴스화 된다.) 
	//-> 인스턴스 필드로 이름이 바뀜.(만들어진 객체의 필드가 되니까)
	static String gameName = "마인크래프트"; //p166
	//static -> 인스턴스 만들지 않고 이 필드를 쓸수있게 해줌.

	String server = "한국";
	String id;
	String passWd;
	
	//생성자
	public Game() {
		
	}
	
	public Game(String id) {
		this.id = id;
	}

	public Game(String id, String passWd) {
		this.id = id;
		//this -> 명확히 말하면, 인스턴스필드를 가리키는것.(객체 자신의 필드)
		this.passWd = passWd;
	}
	
	//메소드 -> 객체로 만든다. -> 인스턴스 메소드
	void getInfo() {
		System.out.println("Gamename : " + gameName);
		System.out.println("id : " + id);
		System.out.println("passwd : " + passWd);
	}
	
	void getInfo(String temp) {
		
	}
}
