package ch1_strategy;

public class TransferPay implements PayBehavior{

	@Override
	public void pay(int amount) {
		System.out.println("계좌이체 결제 : "+amount+"원");
	}

}
