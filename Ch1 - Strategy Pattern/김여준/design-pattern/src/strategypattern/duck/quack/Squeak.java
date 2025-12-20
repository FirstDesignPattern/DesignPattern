package strategypattern.duck.quack;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("고무 오리는 삑 하고 웁니다.");
    }
}
