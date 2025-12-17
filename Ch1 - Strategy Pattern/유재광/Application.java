package ch01.application;

import ch01.application.payment.PaymentRequest;
import ch01.application.payment.PaymentService;
import ch01.application.payment.PaymentType;
import ch01.application.payment.registry.PaymentStrategyRegistry;
import ch01.application.payment.strategy.CardPaymentStrategy;
import ch01.application.payment.strategy.KakaoPayPaymentStrategy;
import ch01.application.payment.strategy.PaymentStrategy;
import ch01.application.payment.strategy.TossPayPaymentStrategy;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<PaymentStrategy> strategies = List.of(
                new CardPaymentStrategy(),
                new KakaoPayPaymentStrategy(),
                new TossPayPaymentStrategy()
        );

        PaymentStrategyRegistry registry = new PaymentStrategyRegistry(strategies);

        PaymentService service = new PaymentService(registry);

        PaymentRequest request1 = new PaymentRequest(PaymentType.CARD, 10000);
        PaymentRequest request2 = new PaymentRequest(PaymentType.KAKAO_PAY, 20000);
        PaymentRequest request3 = new PaymentRequest(PaymentType.TOSS_PAY, 30000);

        service.pay(request1);
        service.pay(request2);
        service.pay(request3);
    }
}