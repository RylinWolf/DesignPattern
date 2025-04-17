package behavioral.command.queue;

import behavioral.command.ExitCommand;
import behavioral.command.HelpCommand;

/**
 * @author linexsong
 */
public class Client {
    public static void main(String[] args) {
        CommandQueue queue = new CommandQueue();
        queue.addCommand(new ExitCommand());
        queue.addCommand(new HelpCommand());

        Invoker invoker = new Invoker();
        invoker.setQueue(queue);

        invoker.call();
    }
}
