package creational.factoryMethod;

/**
 * @author linexsong
 */
public interface LoggerFactory {
    /**
     * 创建日志记录器
     *
     * @return Logger
     */
    Logger createLogger();

    /**
     * 工厂方法的重载，实现根据不同参数构造不同产品
     *
     * @param args 参数
     * @return Logger
     */
    Logger createLogger(String args);
}
