package creational.factorymethod;

/**
 * 隐藏工厂方法，在工厂类中直接调用产品对象的业务方法
 *
 * @author linexsong
 */
public abstract class AbstractHideMethodLoggerFactory implements LoggerFactory {
    public void writeLog() {
        // 直接调用产品的相关方法
        Logger logger = this.createLogger();
        logger.writeLog();
    }

    /**
     * 创建日志管理器
     *
     * @return Logger
     */
    public abstract Logger createLogger();
}
