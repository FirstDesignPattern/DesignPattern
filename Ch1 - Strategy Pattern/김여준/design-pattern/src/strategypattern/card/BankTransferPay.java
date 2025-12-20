package strategypattern.card;

public class BankTransferPay implements PayStrategy{
    public void pay (int amount) {
        System.out.println(amount+ " 금액을 계좌로 이체합니다.");
    }
}
