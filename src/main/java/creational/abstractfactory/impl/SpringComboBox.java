package creational.abstractfactory.impl;

import creational.abstractfactory.ComboBox;

/**
 * @author linexsong
 */
public class SpringComboBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("显示浅绿色下拉框");
    }
}
