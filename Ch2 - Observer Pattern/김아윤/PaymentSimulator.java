package CH02_Observer;

public class PaymentSimulator {
	public static void main(String[] args) {
		PaymentData paymentData = new PaymentData();
		
		UserIdFraudDetector userIdFraudDetector = new UserIdFraudDetector(paymentData);
		MethodFraudDetector methodFraudDetector= new MethodFraudDetector(paymentData);
		AmountFraudDetector amountFraudDetector = new AmountFraudDetector(paymentData);
		
		paymentData.setPayment("PAYMENT-1",null,"MERCHANT-1","CARD",1000);
		System.out.println();
		paymentData.setPayment("PAYMENT-1","USER-1","MERCHANT-1","CARDD",2000);
		System.out.println();
		paymentData.setPayment("PAYMENT-1","USER-1","MERCHANT-1","KAKAOPAY",-1000);
		System.out.println();
		paymentData.setPayment("PAYMENT-1","USER-1","MERCHANT-1","NAVERPAY",3000);
		
	}
}
