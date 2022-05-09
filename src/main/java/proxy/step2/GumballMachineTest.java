package proxy.step2;

import proxy.step1.GumballMonitor;

public class GumballMachineTest {

    public static void main(String[] args) {
        GumballMachineRemote gumballMachine = new GumballMachine("서울", 10);
        GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);
        gumballMonitor.report();
    }
}
