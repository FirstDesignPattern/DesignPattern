package duck;

import duck.fly.FlyWithWings;

public class MallardDuck extends Duck{

    public MallardDuck(){
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("대충 청둥오리");
    }
}
