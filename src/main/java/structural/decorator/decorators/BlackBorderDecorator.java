package structural.decorator.decorators;

import structural.decorator.AbstractComponent;

/**
 * 黑色边框具体装饰类
 *
 * @author linexsong
 */
public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(AbstractComponent component) {
        super(component);
    }

    @Override
    public void display() {
        setBlackBorder();
        super.display();
    }

    private void setBlackBorder() {
        System.out.println("为构件设置黑色边框");
    }
}
