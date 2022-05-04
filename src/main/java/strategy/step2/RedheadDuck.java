package strategy.step2;

public class RedheadDuck extends Duck implements Flyable, Quackable {

    protected void swim() {
        System.out.println("RedheadDuck swim");
    }

    protected void display() {
        System.out.println("RedheadDuck display");
    }

    public void fly() {
        System.out.println("RedheadDuck fly");
    }

    public void quack() {
        System.out.println("RedheadDuck quack");
    }
}
