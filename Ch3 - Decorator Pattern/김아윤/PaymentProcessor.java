package CH03_Decorator;

public abstract class PaymentProcessor {
	String description = "제목 없음";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double pay(String paymentId, String userId, String merchantId, String method, int amount);
}
