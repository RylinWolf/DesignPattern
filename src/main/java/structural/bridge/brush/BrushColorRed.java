package structural.bridge.brush;

/**
 * @author linexsong
 */
public class BrushColorRed implements BrushColor {
    private final String color;

    public BrushColorRed() {
        this.color = "红色";
    }

    @Override
    public String getColor() {
        System.out.println("笔触颜色为红色");
        return color;
    }
}
