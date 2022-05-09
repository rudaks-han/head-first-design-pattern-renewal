package proxy.test;

public class PrintPublisher implements Publisher {

    private Publisher publisher;

    public PrintPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public void publish() {
        long start = System.currentTimeMillis();
        publisher.publish();
        System.out.println((System.currentTimeMillis() - start) + "ms");
    }
}
