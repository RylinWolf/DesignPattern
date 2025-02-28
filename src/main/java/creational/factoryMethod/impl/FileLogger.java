package creational.factoryMethod.impl;

import creational.factoryMethod.Logger;

/**
 * @author linexsong
 */
public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("文件日志记录");
    }
}
