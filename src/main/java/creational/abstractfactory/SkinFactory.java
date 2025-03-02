package creational.abstractfactory;

/**
 * @author linexsong
 */
public interface SkinFactory {
    /**
     * 创建按钮
     *
     * @return button
     */
    Button createButton();

    /**
     * 创建下拉框
     *
     * @return comboBox
     */
    ComboBox createComboBox();

    /**
     * 创建文本框
     *
     * @return textField
     */
    TextField createTextField();
}
