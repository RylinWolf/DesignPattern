package creational.factoryMethod.impl;

import creational.factoryMethod.Logger;

/**
 * @author linexsong
 */
public class DatabaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录");
    }
}
