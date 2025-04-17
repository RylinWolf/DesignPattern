package behavioral.command.adder;

/**
 * @author linexsong
 */
public class CalculatorForm {
    private AbstractCommand command;

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public void compute(int value) {
        int i = command.execute(value);
        System.out.println("执行完毕，结果为 " + i);
    }

    public void undo() {
        System.out.println("撤销完成，结果为 " + command.undo());
    }
}
