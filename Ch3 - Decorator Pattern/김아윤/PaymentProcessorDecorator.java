package CH03_Decorator;

public abstract class PaymentProcessorDecorator extends PaymentProcessor{
	PaymentProcessor paymentProcessor;
	
	public abstract String getDescription();
}
