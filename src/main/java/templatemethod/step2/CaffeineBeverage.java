package templatemethod.step2;

public class CaffeineBeverage {

    public void prepareRecipe() {
        boilWater();
        pourInCup();
    }

    protected void boilWater() {
        System.out.println("물 끓이는 중");
    }

    protected void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
}
