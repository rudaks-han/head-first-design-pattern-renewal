package templatemethod.step4;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Duck implements Comparable<Duck>{

    private String name;

    private int weight;

    @Override
    public int compareTo(Duck duck) {
        if (this.weight < duck.weight) {
            return -1;
        } else if (this.weight == duck.weight) {
            return 0;
        } else {
            return 1;
        }
    }
}
