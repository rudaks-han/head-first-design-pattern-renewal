package proxy.test;

public class PublishTest {

    public static void main(String[] args) {
        /*Publisher publisher = new SimplePublisher();
        publisher.publish();*/

        Publisher publisher = new PrintPublisher(new SimplePublisher());
        publisher.publish();
    }
}
