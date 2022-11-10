package com.yedam.java.example;

import java.util.Scanner;

public class ExeApp {

	Scanner sc = new Scanner(System.in);
	Bank[] Bary = null;
	int menuNo;

	public ExeApp() {

		while (true) {

			showMenu();
			System.out.println("메뉴선택> ");
			menuNo = Integer.parseInt(sc.nextLine());

			switch (menuNo) {
			case 1:
				// 회원수입력 -> 뱅크 배열 사이즈 몇개넣을지 지정
				setSize();
				break;
			case 2:
				// 입력 -> 반복문으로 입력
				setInfo();
				break;
			case 3:

				break;
			case 4:
				// 모두 조회
				showInfo();
				break;
			case 5:

				break;
			case 6:

				break;
			default:

			}

		}

	}

	// 메뉴 출력
	public void showMenu() {
		System.out.println("===========================================================");
		System.out.println("| 1. 회원 수 입력 2. 입력 3. 단건 조회 4. 모두 조회 5. 삭제 6. 종료  |");
		System.out.println("===========================================================");
	}

	public void setSize() {
		// 회원 수를 입력받아서 배열의 크기 지정
		System.out.println("회원의 수 >");
		int count = Integer.parseInt(sc.nextLine());
		Bary = new Bank[count];
	}

	public void showInfo() {
		for (int i = 0; i < Bary.length; i++) {
			Bary[i].getInfo();
		}
	}

	// 회원 정보 입력
	public void setInfo() {
		// 배열 크기 만큼 반복문을 실행
		// 회원 정보를 객체 담아서 배열에 저장
		for (int i = 0; i < Bary.length; i++) {

			// 빈 깡통
			Bank bank = new Bank(); // 1

			// 1. 계좌 번호 입력
			System.out.println("계좌 번호 >");
			int account = Integer.parseInt(sc.nextLine());
			bank.setAccount(account);

			// 2. 은행 이름 입력
			System.out.println("은행 입력 >");
			String bName = sc.nextLine();
			bank.setBank(bName);

			// 3. 예금
			System.out.println("금액 설정 >");
			int money = Integer.parseInt(sc.nextLine());
			bank.setMoney(money);

			// 4. 고객 이름 입력
			System.out.println("고객 이름 >");
			String name = sc.nextLine();
			bank.setName(name);
			// ----------------------------------------
			// bank 객체 ( 계좌번호, 은행이름, 예금, 고객 이름)
			Bary[i] = bank;
		}
	}
}
