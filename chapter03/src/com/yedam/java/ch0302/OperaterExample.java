package com.yedam.java.ch0302;

public class OperaterExample {

	public static void main(String[] args) {
		//부호 연산자
		int a = -100;
		int result1 = +a;  // 해당부호 유지
		int result2 = -a;  // 해당부호 반대
		System.out.println("result:" + result1);
		System.out.println("result:" + result2);

		byte b = 100;
//		byte result3 = (byte)-b;
		int result3 = -b; // 강제변환이 아닌이상 인트값으로 해줘야함. 연산 결과는 int 값
		System.out.println("result3:"+result3);
		
		
		
	}

}
