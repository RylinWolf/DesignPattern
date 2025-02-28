package creational.factorymethod.impl;

import creational.factorymethod.AbstractHideMethodLoggerFactory;
import creational.factorymethod.Logger;

/**
 * @author linexsong
 */
public class HideMethodFileLoggerFactory extends AbstractHideMethodLoggerFactory {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }

    @Override
    public Logger createLogger(String args) {
        System.out.println(args);
        return new FileLogger();
    }
}
