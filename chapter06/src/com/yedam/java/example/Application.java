package com.yedam.java.example;

import java.util.Scanner;

public class Application {

	// 배열
	// int[] ary = new int[6];

	// 배열 진화 -> 클래스로 만들어지는 객체 넣을 수 있는 방으로 바뀜(2차원 배열과 비슷)
	// 클래스[] ary2 = new 클래스[6];
	// 2차원 배열
	// -> [ [new Bank()] [new Bank() [new Bank()] [new Bank()] [new Bank()] [new
	// Bank()] ]
	// ex) 회원들의 정보를 하나의 배열에 다 담아줌. => 공통된 정보를 가진 배열을 하나로 묶어줌 -
	
	
	public static void main(String[] args) { //static이라서 자체적으로메소드 만드는 것등 제한이 있다.

		// 은행 고객 정보를 입력받는 프로그램
		/*
		 * sc.next(); -> 엔터 값빼고 데이터 값 다 가져감 / 엔터값은 콘솔에 남게 된다.-> 그 뒤 넥스트라인이 콘솔에 남은 엔터를
		 * 읽는다.(갑자기 종료되거나 끝날수도) sc.nextLine(); -> 엔터값 읽음. 엔터 앞까지의 내용 읽음(엔터기준 동작)
		 */
		
		new ExeApp(); //->받는대상 없이 그냥 얘를 실행해서 안에있는 것을 동작시킴.
	    //ExeApp app = new ExeApp();

		// While을 활용\
		

	}

	



}
