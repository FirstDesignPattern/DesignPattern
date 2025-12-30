package CH03_Decorator;

public class PaymentSimulator {
	public static void main(String[] args) {
		
		PaymentProcessor processor1 = new KakaopayPaymentProcessor();
		System.out.println(processor1.getDescription());
		System.out.println(processor1.pay("PAYMENT-1","USER-1","MERCHANT-1","CARD",13000));
		System.out.println();
		
		PaymentProcessor processor2 = new NaverpayPaymentProcessor();
		processor2 = new CouponDiscountDecorator(processor2, 2000);
		System.out.println(processor2.getDescription());
		System.out.println(processor2.pay("PAYMENT-1","USER-1","MERCHANT-1","CARD",13000));
		System.out.println();
		
		PaymentProcessor processor3 = new KakaopayPaymentProcessor();
		processor3 = new CouponDiscountDecorator(processor3, 3000);
		processor3 = new FeeDecorator(processor3, 0.1);
		System.out.println(processor3.getDescription());
		System.out.println(processor3.pay("PAYMENT-1","USER-1","MERCHANT-1","CARD",13000));
		System.out.println();
	}

}
