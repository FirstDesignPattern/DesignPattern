package ch1_strategy;

public abstract class Payment {
	
	PayBehavior payBehavior;
    
    public Payment() {}

    public abstract void display();
    
    public void performPay(int amount) {
        payBehavior.pay(amount);
    }
    
    public void setPayBehavior(PayBehavior payBehavior) {
        this.payBehavior = payBehavior;
    }
   
}
