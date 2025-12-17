package ch1_strategy;

public class NaverPay implements PayBehavior{

	@Override
	public void pay(int amount) {
		System.out.println("네이버페이 결제 : " + amount + "원");
	}
}
