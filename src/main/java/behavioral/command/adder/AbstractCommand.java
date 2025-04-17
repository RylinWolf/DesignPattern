package behavioral.command.adder;

/**
 * @author linexsong
 */
public abstract class AbstractCommand {
    /**
     * 执行加法方法
     *
     * @param value 添加的数值
     * @return 执行后的结果
     */
    public abstract int execute(int value);

    /**
     * 执行撤销方法
     *
     * @return 撤销后的结果
     */
    public abstract int undo();
}
