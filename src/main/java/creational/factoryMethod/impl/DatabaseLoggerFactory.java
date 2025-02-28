package creational.factoryMethod.impl;

import creational.factoryMethod.Logger;
import creational.factoryMethod.LoggerFactory;

/**
 * @author linexsong
 */
public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        // 连接数据库，代码省略
        // 创建数据库日志记录器
        Logger logger = new DatabaseLogger();
        // 进行配置，代码省略
        return logger;
    }

    @Override
    public Logger createLogger(String args) {
        return null;
    }
}
