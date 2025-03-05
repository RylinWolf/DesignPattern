package structural.bridge.brush;

/**
 * @author linexsong
 */
public class SmallBrush extends AbstractBrush {
    public SmallBrush(BrushColor color) {
        this.setColor(color);
    }

    public SmallBrush() {
    }

    @Override
    void write() {
        System.out.println("笔触颜色为：" + color.getColor() + "，笔触大小为 小号");
    }
}
