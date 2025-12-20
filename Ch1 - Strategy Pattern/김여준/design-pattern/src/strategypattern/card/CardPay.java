package strategypattern.card;

public class CardPay implements PayStrategy{
    public void pay (int amount) {
        System.out.println(amount + " 금액을 카드로 결제합니다.");
    }
}
