package proxy.test;

public class SimplePublisher implements Publisher {
    @Override
    public void publish() {
        System.out.println("publish...");
    }
}
