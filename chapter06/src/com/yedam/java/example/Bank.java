package com.yedam.java.example;

import com.yedam.java.example.Bank;

public class Bank {
	//필드
			private String name;
			private String bank;
			private int account;
			private int money;
			
			//생성자

			//메소드
			public void getInfo() {
				System.out.println("=== 입력 하신 회원 정보 ===");
				System.out.println("이름 : " + name);
				System.out.println("은행 : " + bank);
				System.out.println("계좌 : " + account);
				System.out.println("잔액 : " + money);
			}
			
			public void withDraw() {
				System.out.println("=== 출금 ===");
				System.out.println("출금하실 경우 아래의 금액으로 출금이 가능합니다.");
				System.out.println("원금 : " + money);
				System.out.println("금리 : %");
				System.out.println("예상 금액 : " + ((money)+(money*0.3)) + "원 입니다.");
			}
			
			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getBank() {
				return bank;
			}

			public void setBank(String bank) {
				this.bank = bank;
			}

			public int getAccount() {
				return account;
			}

			public void setAccount(int account) {
				this.account = account;
			}

			public int getMoney() {
				return money;
			}

			public void setMoney(int money) {
				this.money = money;
			}

}
