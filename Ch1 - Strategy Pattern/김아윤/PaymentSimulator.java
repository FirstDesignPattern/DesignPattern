package ch1_strategy;

public class PaymentSimulator {

	public static void main(String[] args) {
		Payment payment1 = new OnlinePayment();
		payment1.display();
		payment1.performPay(10000);
		
		payment1.setPayBehavior(new KakaoPay());
		payment1.performPay(20000);
		

		Payment payment2 = new OfflinePayment();
		payment2.display();
		payment2.performPay(10000);
		
		payment2.setPayBehavior(new NaverPay());
		payment2.performPay(20000);
	}
}
