package com.yedam.java.ch0604;

public class Computer {
	// 매개변수에 여러개 값 받아올때
	int sum1(int[] values) { // 매개변수에 단순히 선언만 해도 가능(크기 지정할 필요 ㄴ) 
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

	int sum2(int... values) { // 걍 배열이라 생각 
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
