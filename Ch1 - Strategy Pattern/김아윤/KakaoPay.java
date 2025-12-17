package ch1_strategy;

public class KakaoPay implements PayBehavior{

	@Override
	public void pay(int amount) {
		System.out.println("카카오페 결제 : "+amount+"원");
	}

}
