package behavioral.command;

/**
 * @author linexsong
 */
public class HelpCommand extends AbstractCommand {
    private final DisplayHelpFunc func;

    public HelpCommand() {
        this.func = new DisplayHelpFunc();
    }

    @Override
    public void execute() {
        func.displayHelp();
    }
}
