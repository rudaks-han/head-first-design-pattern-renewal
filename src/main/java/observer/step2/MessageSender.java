package observer.step2;

public class MessageSender {

    public static void main(String[] args) {
        MessageData messageData = new MessageData();
        MessageClient messageClient = new MessageClient(messageData);

        messageData.setMessage(
                new Message(
                        "kmhan",
                        "Hello World"
                )
        );
    }
}
