package decorator.step1;

public class DarkRoast extends Beverage {

    @Override
    protected String getDescription() {
        return "DarkRoast";
    }

    @Override
    protected double cost() {
        return 20;
    }
}
