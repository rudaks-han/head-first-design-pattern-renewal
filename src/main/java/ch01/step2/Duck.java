package ch01.step2;

public abstract class Duck {
    // swim, display - 공통
    // fly, quack - 다른것

    abstract protected void swim();

    abstract protected void display();

    // 날아가는 행동을 바꾸기 위해 모든 Duck의 서브클래스를 바꿀수도 있다.
}
