package com.yedam.java.ch0204;

import java.util.Scanner;   // 기본제공이 아니여서 import해야함

public class VariableExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value); // 처음 가지고 있는 값 그대로 출력
		System.out.printf("상품의 가격:%6d원\n", value); // 총  6자리로 표기
		System.out.printf("상품의 가격:%-6d원\n", value); // 오른쪽 빈자리
		System.out.printf("상품의 가격:%06d원\n", value); // 왼쪽 빈자리0채움. 
		
		double area = 3.14159 * 10 * 10;
		System.out.println(area);
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n",10,area);
		
		//스캐너 - > 클래스임 / new라는 연산자씀
		Scanner sc = new Scanner(System.in); //ctrl shift o ->스캐너 사용.
		
//		String str = sc.nextLine();  // 엔터치는 순간까지 한줄로 읽음 - 입력가능 / 무조건 단독으로 써야함. 
		                                      //->기준이 다름  -> 넥스트라인은 엔터까지 읽어서 출력. 넥스트.낵스트인트는 엔터값을 못봄.
//		System.out.println("입력:"+ str);
		
		/*
		String str = s
		int var = sc.nextInt();   // 한줄을 통해 2개의 값을 각각 받을때 '넥스트'와 '넥스트인트(쇼트,더블, 등..)' 써야함.
		System.out.println("입력:"+ str +","+ var);
		*/
		
		//-==========================================================================
//		
//		int x = sc.nextInt(); 
//		int y = sc.nextInt();   // 한줄을 통해 2개의 값을 각각 받을때 '넥스트'와 '넥스트인트(쇼트,더블, 등..)' 써야함.->중간에 공백이 있어야지 각각 들어감
//		System.out.println("입력:"+(x+y));
//		
//	
		/*
		System.out.print("첫번째: ");
		String x = sc.nextLine();
		System.out.print("두번째: ");
	    String y = sc.nextLine();
	    int result = Integer.parseInt(x) + Integer.parseInt(y);
	    System.out.println("입력:"+ result);
	    */
		
		String inputData;
		
		while(true) {
			inputData = sc.nextLine();
			System.out.printf("입력된 문자열: %s\n", inputData);
			if (inputData.equals("exit")){
				break;
		     }
		}
		System.out.println("종료");
	     //==========================================================================
	}
}
 