package com.yedam.java.ch0604;

public class Calculator {
	// 메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	int plus(int x, int y) {
		int result = x + y;
		return result;  //리턴과 리턴값의 유형은 같아야함
	}

	double divide(int x, int y) {
		double result = (double) x / (double) y;
		return result;
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	//////내부 메소드 호출
	
	double avg(int x, int y){
		int sum = plus(x,y); 
		double result = sum/2.0;
		return result;
	}
	
	void execute() {
		double result = avg(7,10);
		println("실행결과 : "+ result);  
	}
	void println(String message) {
		System.out.println(message);
	}
	
	
	////오버로딩 - 사각형 넓이
	double areaRectangle(double width) {  //정사각형
		return width * width;
	}
	
	double areaRectangle(double width, double height) { //직사각형
		return width * height;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
