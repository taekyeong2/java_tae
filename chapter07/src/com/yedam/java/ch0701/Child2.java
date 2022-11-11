package com.yedam.java.ch0701;

import com.yedam.java.ch0701_1.Parent; //다른패키지부모상속

public class Child2 extends Parent {
	//필드
	
	//생성자
	
	//메소드
	void getInfo() {
		System.out.println(firstName+lastName+bloodType+age);
		//default필드들이 오류 (다른패키지랑은 사용 X)
		//protected필드들은 부모필드 사용 가능
		//public -> 다른패키지 사용 가능
		
		
	}
	
}
