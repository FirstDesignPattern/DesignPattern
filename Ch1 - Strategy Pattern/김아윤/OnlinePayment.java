package ch1_strategy;

public class OnlinePayment extends Payment{
	
	public OnlinePayment() {
        this.payBehavior = new CardPay();
    }
	
	@Override
    public void display() {
        System.out.println("== 온라인 결제 ==");
    }
}
