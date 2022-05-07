package adapter.channel;

public class SendbirdGroupChannel implements SendbirdChannel {
    @Override
    public void create() {
        System.out.println("Sendbird 그룹채널 생성");
    }
}
