package com.yedam.java;


import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String confirm;
		Product p = new Product();
		
		System.out.println("상품수를 입력하세요.");
		p.setCount();
		
		System.out.println("상품정보를 입력하세요.");
		p.setInfo();
		
		System.out.println("상품정보를 보시겠습니까? (y/n)");
		confirm = sc.nextLine();
		if(confirm.equals("y") || confirm.equals("Y") ) {
			p.showInfo();
		}
		
		System.out.println("상품 분석 보시겠습니까? (y/n)");
		confirm = sc.nextLine();
		if(confirm.equals("y") || confirm.equals("Y") ) {
			p.analysis();
		}

	}
}
