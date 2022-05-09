package iterator.step2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MenuItem {

    private String name;
    private String description;
    private boolean vegetarian;
    private double price;
}
