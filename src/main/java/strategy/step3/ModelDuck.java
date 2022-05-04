package strategy.step3;

public class ModelDuck extends Duck {

    public ModelDuck() {
        super(new FlyNoWay(), new Quack());
    }

    public void display() {
        System.out.println("I am ModelDuck");
    }
}
