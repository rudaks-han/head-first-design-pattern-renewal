package decorator.step2;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Beverage {

    protected String description = "기본";

    private double milkCost = 0.1;

    private double soyCost = 0.1;

    private double mochaCost = 0.1;

    private double whipCost = 0.1;

    private boolean milk;

    private boolean soy;

    private boolean mocha;

    private boolean whip;

    public double cost() {
        double condimentCost = 0.0;
        if (hasMilk()) {
            condimentCost += milkCost;
        }

        if (hasSoy()) {
            condimentCost += soyCost;
        }

        if (hasMocha()) {
            condimentCost += mochaCost;
        }

        if (hasWhip()) {
            condimentCost += whipCost;
        }

        return condimentCost;
    }

    private boolean hasMilk() {
        return milk;
    }

    private boolean hasSoy() {
        return soy;
    }

    private boolean hasMocha() {
        return mocha;
    }

    private boolean hasWhip() {
        return whip;
    }
}
