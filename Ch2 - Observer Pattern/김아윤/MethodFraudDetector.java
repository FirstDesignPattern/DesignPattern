package CH02_Observer;

public class MethodFraudDetector implements PaymentObserver{
	private PaymentData paymentData;
	
	public MethodFraudDetector(PaymentData paymentData) {
		this.paymentData = paymentData;
		paymentData.registerObserver(this);
	}
	
	@Override
	public void onPaid() {
		String method = paymentData.getMethod();
		
		if(!method.equals("TRANSFER") && !method.equals("CARD") && !method.equals("KAKAOPAY") && !method.equals("NAVERPAY")) {
			System.out.println("이상거래 탐지 : 비정상적인 결제 방식("+method+")");
			return;
		}
		System.out.println("정상거래 확인 : 정상적인 결제 방식("+method+")");
	}
}
