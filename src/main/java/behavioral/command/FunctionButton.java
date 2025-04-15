package behavioral.command;

/**
 * @author linexsong
 */
public class FunctionButton {
    private AbstractCommand command;

    /** 为功能键注入命令 */
    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    /** 发送请求的方法 */
    public void click() {
        command.execute();
    }


}
