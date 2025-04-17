package behavioral.command.queue;

import behavioral.command.AbstractCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linexsong
 */
public class CommandQueue {
    private final List<AbstractCommand> commands = new ArrayList<>();

    public void addCommand(AbstractCommand command) {
        commands.add(command);
    }

    public void removeCommand(AbstractCommand command) {
        commands.remove(command);
    }

    public void execute() {
        commands.forEach(AbstractCommand::execute);
    }
}
