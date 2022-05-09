package proxy.step2;

import java.rmi.Remote;

public interface GumballMachineRemote extends Remote {

    int getCount();

    String getLocation();
}
