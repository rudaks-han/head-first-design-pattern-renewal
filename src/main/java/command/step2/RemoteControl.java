package command.step2;

import java.util.Arrays;

public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        Arrays.stream(onCommands).forEach(command -> command = noCommand);
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n------- 리모컨 --------\n");
        for (int i=0; i<onCommands.length; i++) {
            sb.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }

        return sb.toString();
    }
}
