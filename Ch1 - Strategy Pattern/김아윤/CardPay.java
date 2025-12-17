package ch1_strategy;

public class CardPay implements PayBehavior{

	@Override
	public void pay(int amount) {
		System.out.println("카드 결제 : "+amount+"원");
	}

}
