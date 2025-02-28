package creational.factorymethod.impl;

import creational.factorymethod.Logger;

/**
 * @author linexsong
 */
public class DatabaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录");
    }
}
