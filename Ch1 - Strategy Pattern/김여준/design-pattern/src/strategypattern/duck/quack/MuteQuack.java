package strategypattern.duck.quack;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("나무 오리는 울 수 없습니다.");
    }
}
