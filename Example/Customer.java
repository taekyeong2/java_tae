package object.chpater06;

public class Customer {
	
	//필드
	String name;
	String bank;
	int account;
	int money;
	
	//생성자
	public Customer(String name, String bank, int account, int money) {
		this.name = name;
		this.bank = bank;
		this.account = account;
		this.money = money;
	}
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
		System.out.println("금리 : " + (Bank.INTEREST_RATIO*100) + "%");
		System.out.println("예상 금액 : " + ((money)+(money*Bank.INTEREST_RATIO)) + "원 입니다.");
	}
}
