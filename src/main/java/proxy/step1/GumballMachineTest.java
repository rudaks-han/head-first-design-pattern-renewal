package proxy.step1;

import proxy.step2.GumballMachine;
import proxy.step2.GumballMachineRemote;
import proxy.step2.GumballMonitor;

public class GumballMachineTest {

    public static void main(String[] args) {
        GumballMonitor gumballMonitor = new GumballMonitor(new GumballMachine("서울", 10));
        gumballMonitor.report();
    }
}
