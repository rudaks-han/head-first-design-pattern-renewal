package proxy.step1;

import lombok.Getter;

@Getter
public class GumballMachine {

    private String location;

    private int count;

    public GumballMachine(String location, int count) {
        this.location = location;
        this.count = count;
    }
}
