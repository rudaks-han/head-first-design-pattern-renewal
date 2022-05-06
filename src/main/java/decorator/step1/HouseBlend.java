package decorator.step1;

public class HouseBlend extends Beverage {
    @Override
    protected String getDescription() {
        return "HouseBlend";
    }

    @Override
    protected double cost() {
        return 10;
    }
}
