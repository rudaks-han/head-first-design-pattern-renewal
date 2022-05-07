package factory.step1;

public class Pizza {

    public Pizza orderPizza() {
        Pizza pizza = new Pizza();

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    private void prepare() {

    };

    private void bake() {

    }

    private void cut() {

    }

    private void box() {

    }
}
