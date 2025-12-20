package strategypattern.duck;

import strategypattern.duck.fly.FlyWithWings;
import strategypattern.duck.quack.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("저는 청둥오리 입니다.");
    }
}
