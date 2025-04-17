package behavioral.command.adder;

/**
 * @author linexsong
 */
public class Client {
    public static void main(String[] args) {
        CalculatorForm form = new CalculatorForm();

        form.setCommand(new AddCommand());
        form.compute(10);
        form.compute(12);
        form.undo();
        form.compute(14);
    }
}
