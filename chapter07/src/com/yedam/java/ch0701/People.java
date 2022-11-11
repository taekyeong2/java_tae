package com.yedam.java.ch0701;

//public class People extends Student {  -> final클래스 상속 불가능
public class People extends Student2 {
	public String name;
	public String ssn;
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}

//	@Override
//	public void getScore() {  -> fianl 부모 메소드 오버라이딩 노노
//		
//	}
	
}
