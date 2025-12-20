package strategypattern.card;

public class Main {
    public static void main(String[] args) {
        Checkout c1 = new Checkout(new CardPay());

        c1.pay(10000);

        Checkout c2 = new Checkout(new BankTransferPay());

        c2.pay(10000);
    }
}
