package command.step2;

public class StereoWithCdCommand implements Command {

    private Stereo stereo;

    public StereoWithCdCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume();
    }
}
