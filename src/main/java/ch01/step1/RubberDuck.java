package ch01.step1;

public class RubberDuck extends Duck {
    protected void quack() {
        System.out.println("RubberDuck quack");
    }

    protected void swim() {
        System.out.println("RubberDuck swim");
    }

    protected void display() {
        System.out.println("RubberDuck display");
    }

    protected void fly() {
        // 고무 오리는 날지 못한다.
        // 아무것도 하지 않도록 오버라이드
        // RubberDuck은 fly를 상속받으면 안된다.
    }
}
