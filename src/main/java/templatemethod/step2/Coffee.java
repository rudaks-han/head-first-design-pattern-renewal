package templatemethod.step2;

public class Coffee extends CaffeineBeverage {

    public void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    private void brewCoffeeGrinds() {
        System.out.println("필터로 커피를 우려내는 중");
    }

    private void addSugarAndMilk() {
        System.out.println("설탕과 우유를 추가하는 중");
    }

}
