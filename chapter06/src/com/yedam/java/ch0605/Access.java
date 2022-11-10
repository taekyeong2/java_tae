package com.yedam.java.ch0605;

public class Access {
	//대상 : 모든 속성, 필드, 메소드, 생성자 등등 자바의 모든 전부
	//public 누구나, 어디서든 접근 가능
	//private 내가 속한 클래스 내부에서만 사용 가능
	//protected 상속 받은 상태에서 부모 - 자식간 사용 가능(패키지 달라도 사용가능)
	//          같은 패키지 내에서 사용 가능
	//default 같은 패키지 내에서 사용 가능. 패키지 다르면 사용 불가 (생략가능)
	
	//필드
	public String free;
	private String privacy;
	protected String parent;
	String basic;
	
	//생성자
	
	//메소드
	public void free() {
		System.out.println("접근 가능 합니다.");
		privacy(); //다른 메소를 활용해서 호출할 수 있다.
	}
	private void privacy(){
		System.out.println("접근 불가능 합니다.");
	}
}
