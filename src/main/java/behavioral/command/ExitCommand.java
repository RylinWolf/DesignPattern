package behavioral.command;

/**
 * @author linexsong
 */
public class ExitCommand extends AbstractCommand {
    private final SystemExitFunc systemExitFunc;

    public ExitCommand() {
        this.systemExitFunc = new SystemExitFunc();
    }

    @Override
    public void execute() {
        systemExitFunc.exit();
    }
}
