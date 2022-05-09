package iterator.step2;

import lombok.Getter;

@Getter
public class DinerMenu {
    private final int MAX_ITEMS = 6;

    private int numberOfItems = 0;

    private MenuItem[] menuItems;

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
