package decorator.step2;

public class StartbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        beverage.setMilk(true);
        beverage.setSoy(true);

        System.out.println(beverage.getDescription() + ", " + beverage.cost());
    }
}
