package structural.bridge.brush;

/**
 * @author linexsong
 */
public abstract class AbstractBrush {
    protected BrushColor color;

    public void setColor(BrushColor color) {
        this.color = color;
    }

    /**
     * 书写
     */
    abstract void write();

    void getColor() {
        System.out.println("当前颜色" + color.getColor());
    }
}
