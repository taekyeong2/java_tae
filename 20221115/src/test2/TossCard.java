package test2;

public class TossCard extends Card {

	private String company = "Toss";
	private String cardStaff;

	public TossCard(String cardNO, int validDate, int cvc, String catdStaff) {
		super(cardNO, validDate, cvc);
		this.cardStaff = catdStaff;
	}

	@Override
	public void showCardInfo() {
		System.out.printf("카드정보 - Card NO, %s\n", getCardNo());
		System.out.printf("담당직원 - %s, %s\n", cardStaff, company);
	}

}
