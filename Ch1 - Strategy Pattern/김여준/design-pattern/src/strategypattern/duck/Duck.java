package strategypattern.duck;

import strategypattern.duck.fly.FlyBehavior;
import strategypattern.duck.quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {}

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("모든 오리는 수영을 할 수 있습니다.");
    }
}
