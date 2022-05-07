package command.step1;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        remoteControl.setCommand(lightOn);
        remoteControl.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageOpenCommand garageOpenCommand = new GarageOpenCommand(garageDoor);
        remoteControl.setCommand(garageOpenCommand);
        remoteControl.buttonWasPressed();
    }
}
