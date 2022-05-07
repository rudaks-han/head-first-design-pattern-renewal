package adapter.channel;

public class SendbirdChannelAdapter implements Channel {

    private SendbirdChannel sendbirdChannel;

    public SendbirdChannelAdapter(SendbirdChannel sendbirdChannel) {
        this.sendbirdChannel = sendbirdChannel;
    }

    @Override
    public void register() {
        sendbirdChannel.create();
    }
}
