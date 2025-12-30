package CH03_Decorator;

public class CouponDiscountDecorator extends PaymentProcessorDecorator {
	private int discount;

	public CouponDiscountDecorator(PaymentProcessor paymentProcessor, int discount){
		this.paymentProcessor = paymentProcessor;
		this.discount = discount;
	}

	@Override
	public String getDescription() {
		return paymentProcessor.getDescription()+", 쿠폰 할인("+discount+"원)";
	}
	
	@Override
	public double pay(String paymentId, String userId, String merchantId, String method, int amount) {
		double beforeAmount = paymentProcessor.pay(paymentId, userId, merchantId, method, amount);
		double finalAmount = Math.max(0, beforeAmount - discount);
		return finalAmount;
	}

}
