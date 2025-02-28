package creational.factoryMethod.impl;

import creational.factoryMethod.AbstractHideMethodLoggerFactory;
import creational.factoryMethod.Logger;

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
