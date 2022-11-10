package com.yedam.java.ch0605;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		은행 고객 정보를 관리하는 클래스
//	    클래스 -> 1) main  2)Customer 3)Bank
//	    1) main -> 생성자를 통한 고객의 정보를 저장, 출력
//		2) Bank -> 해당은행의 금리를 저장
//		금리 = 현재잔액 +( 현재잔액*금리)
//		3) Customer -> 고객의 정보를 저장
//		이름, 은행명, 계좌, 잔액의 필드 
//		getInfo() : 입력한 정보 출력
//		withDraw() :출근할때 정보를 출력
		
		Scanner sc = new Scanner(System.in);
		String confirm;
		
		Customer customer = new Customer("고길동", "농협", 123456888, 1000000);
		
		customer.getInfo();
		
		customer.withDraw();
		System.out.println("출금 하시겠습니까? Y/N");
		
		confirm = sc.nextLine();
		if(confirm.toLowerCase().equals("y")) {
			
			System.out.println("출금 완료");
			
		} else {
			System.out.println("시스템 종료");
		}		
	}
}
