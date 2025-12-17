package ch01.application.payment.strategy;

import ch01.application.payment.PaymentRequest;
import ch01.application.payment.PaymentType;

public class TossPayPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(PaymentRequest request) {
        System.out.println("토스페이 결제 처리: " + request.getAmount());
    }

    @Override
    public PaymentType supports() {
        return PaymentType.TOSS_PAY;
    }
}
