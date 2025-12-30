package CH03_Decorator;

public class FeeDecorator extends PaymentProcessorDecorator{
	private double feePercent;
	
	public FeeDecorator(PaymentProcessor paymentProcessor, double feePercent) {
		this.paymentProcessor = paymentProcessor;
		this.feePercent = feePercent;
	}

	@Override
	public String getDescription() {	
		return paymentProcessor.getDescription()+", 수수료 부과("+feePercent+"%)";
	}
	
	@Override
	public double pay(String paymentId, String userId, String merchantId, String method, int amount) {
		double beforeAmount = paymentProcessor.pay(paymentId, userId, merchantId, method, amount);
		double finalAmount = (int) (beforeAmount*(1-feePercent));
		return finalAmount;
	}

}
