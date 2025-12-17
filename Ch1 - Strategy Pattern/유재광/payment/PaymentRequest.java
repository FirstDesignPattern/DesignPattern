package ch01.application.payment;

public class PaymentRequest {
    private final PaymentType paymentType;
    private final int amount;

    public PaymentRequest(PaymentType paymentType, int amount) {
        this.paymentType = paymentType;
        this.amount = amount;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public int getAmount() {
        return amount;
    }
}
