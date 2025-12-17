package ch1_strategy;

public class OfflinePayment extends Payment{
	
	public OfflinePayment() {
        this.payBehavior = new TransferPay();
    }
	
	@Override
    public void display() {
        System.out.println("== 오프라인 결제 ==");
    }
}
