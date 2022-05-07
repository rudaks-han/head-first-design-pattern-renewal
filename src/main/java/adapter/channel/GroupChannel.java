package adapter.channel;

public class GroupChannel implements Channel {
    @Override
    public void register() {
        System.out.println("Victory 그룹 채널 생성");
    }
}
