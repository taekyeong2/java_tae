package test2;

public class DGBCard extends Card {

	private String company = "대구은행";
	private String cardStaff;

	public DGBCard(String cardNO, int validDate, int cvc, String cardStaff) {
		super(cardNO, validDate, cvc);
		this.cardStaff = cardStaff;
	}

	@Override
	public void showCardInfo() {
		super.showCardInfo();
		//System.out.printf("카드정보 ( Card NO: %s, 유효기간: %d, CVC: %d ) \n", getCardNo(), getValidDate(), getCvc());
		System.out.printf("담당직원 - %s, %s\n", cardStaff, company);
	}

}
