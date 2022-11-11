package com.yedam.java.ch0701;

public class Member extends People{
	//생성자를 만들어 줘야함 -> 기본생성자가 아님. 부모클래스에서 생성자 만들어서
	public int stdNo;
	
	public Member(String name, String ssn, int stdNo) {
		super(name, ssn); //-> 부모클래스있는 생성자를 호출하는 명령
		//부모객체를 먼저 만들고 자식객체를 만든다.
		//부모생성자가 기본 생성자일땐 어짜피 기본값이라서 사용안해도 가능 (생략_super();)
		// , 매개변수활용해서 생성자 만들땐 super(데이터)생성자 호출
		
	} 

}
