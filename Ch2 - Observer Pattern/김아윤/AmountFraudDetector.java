package CH02_Observer;

public class AmountFraudDetector implements PaymentObserver{
	private PaymentData paymentData;
	
	public AmountFraudDetector(PaymentData paymentData){
		this.paymentData = paymentData;
		paymentData.registerObserver(this);
	}

	@Override
	public void onPaid() {
		int amount = paymentData.getAmount();
		
		if(amount < 0) {
			System.out.println("이상거래 탐지 : 비정상적인 결제 금액("+amount+")");
			return;
		}
		System.out.println("정상거래 확인 : 정상적인 결제 금액("+amount+")");
	}

}
