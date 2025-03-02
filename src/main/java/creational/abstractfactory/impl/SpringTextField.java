package creational.abstractfactory.impl;

import creational.abstractfactory.TextField;

/**
 * @author linexsong
 */
public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示浅绿色文本框");
    }
}
