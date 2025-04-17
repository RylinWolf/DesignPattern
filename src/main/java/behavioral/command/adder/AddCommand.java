package behavioral.command.adder;

/**
 * @author linexsong
 */
public class AddCommand extends AbstractCommand {
    private final Adder adder = new Adder();
    private int value;

    @Override
    public int execute(int value) {
        this.value = value;
        return adder.add(value);
    }

    @Override
    public int undo() {
        return adder.add(-value);
    }
}
