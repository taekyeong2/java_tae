package com.yedam.java.example;

import java.util.Scanner;

public class ExeApp {
	
	Scanner sc = new Scanner(System.in);   
	Bank[] Bary = null;

	public ExeApp() { // 생성자 호출시 while 문 실행
		while (true) {
			
			showMenu();

			// 회원의 수 입력받아서 배열의 크기를 지정
			System.out.println("회원의 수> ");
			int count = Integer.parseInt(sc.nextLine());
			Bary = new Bank[count]; // 내가 원하는 수 만큼 데이터관리 가능

			//
			for (int i = 0; i < Bary.length; i++) {
				Bary[i].getInfo();
			}
		}
	}

	// 메뉴 출력 -> 클래스 안에서는 메소드 자유롭게 입력 가능
	public void showMenu() {
		System.out.println("============================================");
		System.out.println("1.회원수 입력 2.입력 3.단건조회 4.모든조회 5.삭제 6.종료");
		System.out.println("============================================");
	}

	// 회원 정보 입력
	public void setInfo() {
		// 배열 크기 많큼 반복문을 실행
		// 회원정보를 객체에 담아서 배열에 저장.
		for (int i = 0; i < Bary.length; i++) {
			// 각각의 배열에 객체 만들어서 넣어줌
			// -> 반복문 돌때마다 배열에 담을 새로운 객체 만듬
			Bank bank = new Bank(); // 빈 깡통

			// 빈 깡통에 내용 채우기
			System.out.println("계좌 번호 > ");
			int account = Integer.parseInt(sc.nextLine());
			bank.setAccount(account);

			System.out.println("은행 입력 > ");
			String bankNm = sc.nextLine();
			bank.setBank(bankNm);

			System.out.println("금액 설정 > ");
			int money = Integer.parseInt(sc.nextLine());
			bank.setMoney(money);

			System.out.println("고객이름 > ");
			String name = sc.nextLine();
			bank.setName(name);

			// bank객체(계좌번호, 은행, 예금, 고객이름을 해당하는 위치에 넣어줌) -> 꽉찬 깡통
			Bary[i] = bank;
		}

	}

}
