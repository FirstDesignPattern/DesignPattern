package strategypattern.duck;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();

        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }
}
