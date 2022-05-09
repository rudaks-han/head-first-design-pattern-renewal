package proxy.step2;

import lombok.Getter;

@Getter
public class GumballMachine implements GumballMachineRemote {

    private String location;

    private int count;

    public GumballMachine(String location, int count) {
        this.location = location;
        this.count = count;
    }
}
