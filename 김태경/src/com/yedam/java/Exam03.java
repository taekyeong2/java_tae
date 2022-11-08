package com.yedam.java;

public class Exam03 {
	public static void main(String[] args) {
		//문제4)
		for(int i=1; i<=9; i++) {
			System.out.println("["+ i + "단]");
			for(int j=1; j<=i; j++) {
				System.out.println(i + "x" + j + "=" + (i*j));
			}
		}
	}

}
