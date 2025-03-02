package creational.abstractfactory.impl;

import creational.abstractfactory.Button;
import creational.abstractfactory.ComboBox;
import creational.abstractfactory.SkinFactory;
import creational.abstractfactory.TextField;

/**
 * @author linexsong
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }
}
