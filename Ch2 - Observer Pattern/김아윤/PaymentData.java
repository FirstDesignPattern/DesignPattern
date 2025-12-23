package CH02_Observer;

import java.util.*;

public class PaymentData implements PaymentSubject{
	private List<PaymentObserver> observers;
	
	private String paymentId;
	private String userId;
	private String merchantId;
	private String method;
	private int amount;
	
	public PaymentData() {
		observers = new ArrayList<PaymentObserver>();
	}

	@Override
	public void registerObserver(PaymentObserver o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(PaymentObserver o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for(PaymentObserver observer : observers) {
			observer.onPaid();
		}
	}
	
	public void setPayment(String paymentId, String userId, String merchantId, String method, int amount) {
		this.paymentId = paymentId;
		this.userId = userId;
		this.merchantId = merchantId;
		this.method = method;
		this.amount = amount;
		notifyObservers();
	}

	public String getPaymentId() {
		return paymentId;
	}

	public String getUserId() {
		return userId;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public String getMethod() {
		return method;
	}

	public int getAmount() {
		return amount;
	}
	
}
