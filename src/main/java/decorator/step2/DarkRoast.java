package decorator.step2;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "기본";
    }

    public double cost() {
        return 1.99 + super.cost();
    }
}
