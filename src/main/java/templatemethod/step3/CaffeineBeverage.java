package templatemethod.step3;

public abstract class CaffeineBeverage {

    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    protected void boilWater() {
        System.out.println("물 끓이는 중");
    }

    protected void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
}
