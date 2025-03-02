package creational.abstractfactory.impl;

import creational.abstractfactory.Button;
import creational.abstractfactory.ComboBox;
import creational.abstractfactory.SkinFactory;
import creational.abstractfactory.TextField;

/**
 * @author linexsong
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }
}
