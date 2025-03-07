package structural.decorator.components;

import structural.decorator.AbstractComponent;

/**
 * @author linexsong
 */
public class Window extends AbstractComponent {
    @Override
    public void display() {
        System.out.println("窗口显示");
    }
}
