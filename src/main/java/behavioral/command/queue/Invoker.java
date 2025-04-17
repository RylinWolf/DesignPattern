package behavioral.command.queue;

/**
 * @author linexsong
 */
public class Invoker {
    private CommandQueue queue;

    public void setQueue(CommandQueue queue) {
        this.queue = queue;
    }

    public void call() {
        queue.execute();
    }
}
