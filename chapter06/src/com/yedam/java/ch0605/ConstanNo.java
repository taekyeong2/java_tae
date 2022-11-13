package com.yedam.java.ch0605;

public class ConstanNo {
	//필드
	static final double PI = 3.14; 
	//final 들어가면 대문자 들어가야함, 합성어일땐 다 대문자만들고 가운데 _넣기
	static final int EARTH_ROUND = 46250;
	static final int LIGHT_SPEED = 127000;
	
	String words = "This is Java";
	char word = 'Y';
	
	//생성자
	
	//메소드
	//static 멤버에 사용범위(scope)
	
	//static메소드 
	//static간의 필드 사용
	static void getCircle(int radius) {
		//pi * r * r
		System.out.println("원 넓이: " + (PI*radius*radius));
	    //                             === -> 같은 static영역에 있음./사용가능
	}
	
	//메소드에 static 필드 호출
	//static영역 > 일반영역(힙영역) / 사용가능
	public void allData() {
		double result = PI + EARTH_ROUND + LIGHT_SPEED;
		System.out.println(result);
		getCircle(1);
	}
	
	//static 메소드에 일반필드, 메소드 사용
	public static void words(String words, char word) {
		String getWord = words + String.valueOf(word);
		System.out.println(getWord);
		//String getWord1 = this.words + String.valueOf(this.word);
		//                  ==========                 =========== -> 힙영역에 있는 애들
		//                                                      (일반 기본타입, 참조타입)은 
		//                                                        Static영역 접근 ㄴㄴㄴ
	}
	
	
}
