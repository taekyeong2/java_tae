package com.yedam.java;

public class Exam02 {
	public static void main(String[] args) {
		//문제3) 
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		if(operator == '+') {
			System.out.printf("10 + 2 = %d", (num1+num2));
		}else if(operator == '-') {
			System.out.printf("10 - 2 = %d", (num1-num2));
		}else if(operator == '*') {
			System.out.printf("10 * 2 = %d", (num1*num2));
		}else if(operator == '/') {
			System.out.printf("10 / 2 = %d", (num1/num2));
		}
	}
}
