package com.yedam.java.ch0701;

public class Compute extends Calculater {
// 왼쪽 소스 오버라이드
	@Override
	double areaCircle(double r) {
		System.out.println("Compute 오버라이드 실행");
		return r*r*Math.PI;
	}
	
}
