package creational.abstractfactory.impl;

import creational.abstractfactory.TextField;

/**
 * @author linexsong
 */
public class SummerTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示浅蓝色按钮");
    }
}
