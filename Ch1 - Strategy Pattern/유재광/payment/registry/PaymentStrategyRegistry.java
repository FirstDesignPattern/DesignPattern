package ch01.application.payment.registry;

import ch01.application.payment.PaymentType;
import ch01.application.payment.strategy.PaymentStrategy;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class PaymentStrategyRegistry {

    private final Map<PaymentType, PaymentStrategy> strategyMap;

    public PaymentStrategyRegistry(List<PaymentStrategy> strategies) {
        this.strategyMap = new EnumMap<>(PaymentType.class);

        for (PaymentStrategy strategy : strategies) {
            PaymentType type = strategy.supports();
            strategyMap.put(type, strategy);
        }
    }

    public PaymentStrategy get(PaymentType type) {
        return strategyMap.get(type);
    }
}
