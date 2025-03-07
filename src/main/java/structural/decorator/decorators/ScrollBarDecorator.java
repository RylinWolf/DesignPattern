package structural.decorator.decorators;

import structural.decorator.AbstractComponent;

/**
 * 滚动条具体装饰类
 *
 * @author linexsong
 */
public class ScrollBarDecorator extends ComponentDecorator {
    public ScrollBarDecorator(AbstractComponent component) {
        super(component);
    }

    @Override
    public void display() {
        addScrollBar();
        super.display();
    }

    private void addScrollBar() {
        System.out.println("增加滚动条");
    }
}
