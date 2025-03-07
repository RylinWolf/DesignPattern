package structural.decorator.components;

import structural.decorator.AbstractComponent;

/**
 * @author linexsong
 */
public class TextBox extends AbstractComponent {
    @Override
    public void display() {
        System.out.println("显示文本框");
    }
}
