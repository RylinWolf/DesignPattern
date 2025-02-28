package creational.factorymethod.impl;

import creational.factorymethod.Logger;
import creational.factorymethod.LoggerFactory;

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
