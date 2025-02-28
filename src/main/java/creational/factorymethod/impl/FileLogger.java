package creational.factorymethod.impl;

import creational.factorymethod.Logger;

/**
 * @author linexsong
 */
public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("文件日志记录");
    }
}
