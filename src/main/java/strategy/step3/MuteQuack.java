package strategy.step3;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("mute");
    }
}
