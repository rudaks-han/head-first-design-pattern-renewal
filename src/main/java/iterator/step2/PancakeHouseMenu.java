package iterator.step2;

import lombok.Getter;

import java.util.List;

@Getter
public class PancakeHouseMenu {

    private List<MenuItem> menuItems;

    public Iterator createIterator() {
        return new PancakeIterator(menuItems);
    }
}
