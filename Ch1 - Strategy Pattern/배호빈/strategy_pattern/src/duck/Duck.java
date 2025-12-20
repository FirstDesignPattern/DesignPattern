package duck;

import duck.fly.FlyBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;

    public abstract void display();

    public void swim(){
        System.out.println("모든 오리는 수영을 할 수 있다.");
    }
    public void performFly(){
        flyBehavior.fly();
    }

}
