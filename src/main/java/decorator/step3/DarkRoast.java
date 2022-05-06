package decorator.step3;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "다크 로스트";
    }

    @Override
    public double cost() {
        return 2.99;
    }
}
