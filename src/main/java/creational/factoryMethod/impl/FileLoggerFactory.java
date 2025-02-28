package creational.factoryMethod.impl;

import creational.factoryMethod.Logger;
import creational.factoryMethod.LoggerFactory;

/**
 * @author linexsong
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        Logger logger = new FileLogger();
        // 创建文件，代码省略
        return logger;
    }

    @Override
    public Logger createLogger(String args) {
        return null;
    }
}
