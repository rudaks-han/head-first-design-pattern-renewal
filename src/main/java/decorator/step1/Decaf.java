package decorator.step1;

public class Decaf extends Beverage {
    @Override
    protected String getDescription() {
        return "DarkRoast";
    }

    @Override
    protected double cost() {
        return 30;
    }
}
