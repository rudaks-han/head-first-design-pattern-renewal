package iterator.step1;

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
