package strategy.step3;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new FlyWithWings(), new Squeak());
    }

    public void display() {
        System.out.println("I am mallard duck");
    }
}
