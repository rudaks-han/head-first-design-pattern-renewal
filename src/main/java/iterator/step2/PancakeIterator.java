package iterator.step2;

import java.util.List;

public class PancakeIterator implements Iterator {

    private List<MenuItem> menuItems;

    public PancakeIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuItem next() {
        return null;
    }
}
