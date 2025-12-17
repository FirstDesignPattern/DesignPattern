package ch01.application.payment;

import ch01.application.payment.registry.PaymentStrategyRegistry;
import ch01.application.payment.strategy.PaymentStrategy;

public class PaymentService {

    private final PaymentStrategyRegistry registry;

    public PaymentService(PaymentStrategyRegistry registry) {
        this.registry = registry;
    }

    public void pay(PaymentRequest request) {
        PaymentStrategy strategy = registry.get(request.getPaymentType());
        strategy.pay(request);
    }
}
