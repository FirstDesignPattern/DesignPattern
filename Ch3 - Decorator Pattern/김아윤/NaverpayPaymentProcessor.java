package CH03_Decorator;

public class NaverpayPaymentProcessor extends PaymentProcessor{
	
	public NaverpayPaymentProcessor() {
		description = "네이버페이 결제 성공";
	}
	
	@Override
	public double pay(String paymentId, String userId, String merchantId, String method, int amount) {
		return amount;
	}
}
