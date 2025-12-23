package CH02_Observer;

public class UserIdFraudDetector implements PaymentObserver {
	private PaymentData paymentData;
	
	public UserIdFraudDetector(PaymentData paymentData) {
		this.paymentData = paymentData;
		paymentData.registerObserver(this);
	}
	
	@Override
	public void onPaid() {
		String userId = paymentData.getUserId();
		
		if(userId == null || userId.isEmpty()) {
			System.out.println("이상거래 탐지 : 비정상적인 유저 ID("+userId+")");
			return;
		}
		System.out.println("정상거래 확인 : 정상적인 유저 ID("+userId+")");
	}
}
