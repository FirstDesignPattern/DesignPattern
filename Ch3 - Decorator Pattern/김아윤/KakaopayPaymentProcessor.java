package CH03_Decorator;

public class KakaopayPaymentProcessor extends PaymentProcessor{
	
	public KakaopayPaymentProcessor() {
		description = "카카오페이 결제 성공";
	}
	
	@Override
	public double pay(String paymentId, String userId, String merchantId, String method, int amount) {
		return amount;
	}
}
