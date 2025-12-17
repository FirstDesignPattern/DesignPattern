package ch01.application.payment.strategy;

import ch01.application.payment.PaymentRequest;
import ch01.application.payment.PaymentType;

public class CardPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(PaymentRequest request) {
        System.out.println("카드 결제 처리: " + request.getAmount());
    }

    @Override
    public PaymentType supports() {
        return PaymentType.CARD;
    }
}
