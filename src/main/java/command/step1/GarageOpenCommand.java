package command.step1;

public class GarageOpenCommand implements Command {

    private GarageDoor garageDoor;

    public GarageOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
