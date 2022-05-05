package observer.message;

import java.util.ArrayList;
import java.util.List;

public class MessageData implements Subject {

    private List<Observer> observers;

    private Message message;

    public MessageData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        this.observers.stream().forEach(observer -> observer.update(message));
    }

    public void setMessage(Message message) {
        this.message = message;
        notifyObservers();
    }
}
