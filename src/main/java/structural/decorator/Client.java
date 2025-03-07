package structural.decorator;

import structural.decorator.components.Window;
import structural.decorator.decorators.BlackBorderDecorator;
import structural.decorator.decorators.ScrollBarDecorator;

/**
 * @author linexsong
 */
public class Client {
    public static void main(String[] args) {
        AbstractComponent component, componentBb, componentSb;
        component = new Window();
        // 一次装饰
        componentBb = new BlackBorderDecorator(component);
        // 二次装饰
        componentSb = new ScrollBarDecorator(componentBb);

        componentSb.display();
    }
}
