package ch01.application.payment.strategy;

import ch01.application.payment.PaymentRequest;
import ch01.application.payment.PaymentType;

public interface PaymentStrategy {

    void pay(PaymentRequest request);

    PaymentType supports();
}
