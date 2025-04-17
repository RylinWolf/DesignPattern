package behavioral.command.adder;

/**
 * @author linexsong
 */
public class Adder {
    private int number = 0;

    public Integer add(int value) {
        this.number += value;
        return number;
    }
}
