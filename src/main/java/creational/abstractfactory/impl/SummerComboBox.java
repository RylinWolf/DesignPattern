package creational.abstractfactory.impl;

import creational.abstractfactory.ComboBox;

/**
 * @author linexsong
 */
public class SummerComboBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("显示浅蓝色下拉框");
    }
}
