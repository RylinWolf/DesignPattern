package structural.composite;

/**
 * @author linexsong
 */
public abstract class AbstractFile {
    /**
     * 添加子构件
     *
     * @param file 构件类
     */
    public abstract void add(AbstractFile file);

    /**
     * 移除子构件
     *
     * @param file 构件类
     */
    public abstract void remove(AbstractFile file);

    /**
     * 杀毒业务方法
     */
    public abstract void killVirus();

    /**
     * 根据索引获取子构件
     *
     * @param i 索引
     * @return 指定索引下的子构件类
     */
    public abstract AbstractFile getChild(Integer i);
}
