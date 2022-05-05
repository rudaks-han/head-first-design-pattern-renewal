package observer.step2;

public class MessageClient implements Observer {

    public MessageClient(MessageData messageData) {
        messageData.registerObserver(this);
    }

    @Override
    public void update(Message message) {
        System.out.println("MessageClient received: " + message.toString());
    }
}
