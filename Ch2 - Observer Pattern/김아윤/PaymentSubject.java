package CH02_Observer;

public interface PaymentSubject {
	public void registerObserver(PaymentObserver o);
	public void removeObserver(PaymentObserver o);
	public void notifyObservers();
}
