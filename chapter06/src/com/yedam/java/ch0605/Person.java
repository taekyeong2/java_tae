package com.yedam.java.ch0605;

public class Person {
	final String nation = "korea"; //값 고정
	final String ssn; //생성자를 통해 인스턴스애 최초로 한번 넣으면 고정
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn; //고정 수정 ㄴㄴ
		this.name = name; // 수정 가능
	}
	
}
