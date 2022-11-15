package test2;

public class Card {
	private String cardNo;
	private int validDate;
	private int cvc;

	public Card(String cardNO, int validDate, int cvc) {
		this.cardNo = cardNO;
		this.validDate = validDate;
		this.cvc = cvc;
	}

	public String getCardNo() {
		return cardNo;
	}

	public int getValidDate() {
		return validDate;
	}

	public int getCvc() {
		return cvc;
	}

	public void showCardInfo() {
		System.out.printf("카드정보 ( Card NO: %s, 유효기간: %d, CVC: %d) \n", getCardNo(), getValidDate(), getCvc());
	}

}
