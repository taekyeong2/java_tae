package com.yedam.java.ch0201;

public class VariableExample {
	public static void main(String[] args) {  //main -> ctrl+space 체크 안해도 직접치면됨
		//2022 11 03
		/* 변수의
		   사용 범위 */  
		int value1 = 15;
		if(value1 > 10) {
			int value2;  // 이 변수는 중갈로끝난느 지점까지만 존재. -> 변수 사용 범위 예측 중요.
			value2 = value1 - 10;
		}
		int result = value1 + value2 + 5;
		System.out.println(value1 +","+ value2 + result);
		
		/***/
		
		int v1 = 0;
		if (v1 == 0) {
			v1 = 1;
			int v2 = 0;
			if (v2 == 0) {
				v2 = 2;
				int v3 = v1 + v2;
				System.out.println(v1+"+"+ v2+ "=" +v3);
			}
			System.out.println(v1+"+"+ v2+ "=" +v3);
	    }
		System.out.println(v1+"+"+ v2+ "=" +v3);  //어느 위치에 선언했느냐에 따라 사용 가능 변수 달라짐
