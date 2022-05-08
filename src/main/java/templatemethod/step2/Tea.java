package templatemethod.step2;

public class Tea extends CaffeineBeverage {

    public void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    private void steepTeaBag() {
        System.out.println("찻잎을 우려내는 중");
    }

    private void addLemon() {
        System.out.println("레몬을 추가하는 중");
    }
}
