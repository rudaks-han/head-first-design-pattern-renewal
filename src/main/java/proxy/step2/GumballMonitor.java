package proxy.step2;

public class GumballMonitor {

    private GumballMachineRemote gumballMachine;

    public GumballMonitor(GumballMachineRemote gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        System.out.println("뽑기 기계 위치: " + gumballMachine.getLocation());
        System.out.println("현재 재고: " + gumballMachine.getCount());
    }
}
