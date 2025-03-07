package structural.decorator.decorators;

import structural.decorator.AbstractComponent;

/**
 * 抽象装饰类
 * 维护一个对抽象构件类的引用，并在业务方法中调用其方法，
 * 以便具体装饰类进行增强
 *
 * @author linexsong
 */
public class ComponentDecorator extends AbstractComponent {
    protected AbstractComponent component;

    public ComponentDecorator(AbstractComponent component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
