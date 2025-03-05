package structural.bridge.brush;

/**
 * @author linexsong
 */
public class HugeBrush extends AbstractBrush {
    public HugeBrush(BrushColor color) {
        this.setColor(color);
    }

    public HugeBrush() {
    }

    @Override
    void write() {
        System.out.println("笔触颜色为：" + color.getColor() + "，笔触大小为 大号");
    }
}
