package com.yedam.java.ch0605;

public class Customer {
	String name;
	String bankName;
	int account;
	int money;
	
	public Customer(String name, String bankName, int account, int money) {
		this.name = name;
		this.bankName = bankName;
		this.account = account;
		this.money = money;
	}
	
	void getInfo() {
		System.out.println("==입력 하신 회원 정보==");
		System.out.println("이름 : " + name);
		System.out.println("은행 : " + bankName);
		System.out.println("계좌 : " + account);
		System.out.println("잔액 : " + money);
	}
 
	
	void withDraw() {
		System.out.println("=== 출금 ===");
		System.out.println("출금하실 경우 아래의 금액으로 출금이 가능합니다.");
		System.out.println("원금 : " + money);
		System.out.println("금리 : " + Bank.GOLD + "%" );
		System.out.println("예상 금액  : " + (money+(money * Bank.GOLD))+"원 입니다.");
	}
}
