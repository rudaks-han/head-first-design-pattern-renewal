package decorator.step1;

public class Espresso extends Beverage {
    @Override
    protected String getDescription() {
        return "Espresso";
    }

    @Override
    protected double cost() {
        return 40;
    }
}
