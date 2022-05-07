package adapter.channel;

public class ChannelTest {

    public static void main(String[] args) {
        Channel channel = new GroupChannel();
        channel.register();

        SendbirdChannel sendbirdChannel = new SendbirdGroupChannel();
        sendbirdChannel.create();

        Channel channel1 = new SendbirdChannelAdapter(sendbirdChannel);
        channel1.register();
    }
}
