package strategy.step3;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.display();

        modelDuck.setFlyBehavior(new FlyWithWings());
        modelDuck.performFly();
    }
}
