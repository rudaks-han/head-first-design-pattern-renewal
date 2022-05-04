package strategy.step2;

public class RubberDuck extends Duck implements Quackable {

    protected void swim() {
        System.out.println("RubberDuck swim");
    }

    protected void display() {
        System.out.println("RubberDuck display");
    }

    public void quack() {
        System.out.println("RubberDuck quack");
    }
}
