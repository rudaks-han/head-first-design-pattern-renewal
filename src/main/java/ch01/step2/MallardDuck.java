package ch01.step2;

public class MallardDuck extends Duck implements Flyable, Quackable {

    protected void swim() {
        System.out.println("MallardDuck swim");
    }

    protected void display() {
        System.out.println("MallardDuck display");
    }

    public void fly() {
        System.out.println("MallardDuck fly");
    }

    public void quack() {
        System.out.println("MallardDuck quack");
    }
}
