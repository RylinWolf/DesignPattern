package creational.abstractfactory.impl;

import creational.abstractfactory.Button;

/**
 * @author linexsong
 */
public class SummerButton implements Button {
    @Override
    public void display() {
        System.out.println("显示浅蓝色按钮");
    }
}
