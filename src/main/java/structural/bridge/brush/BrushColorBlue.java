package structural.bridge.brush;

/**
 * @author linexsong
 */
public class BrushColorBlue implements BrushColor {
    private final String color;

    public BrushColorBlue() {
        this.color = "蓝色";
    }

    @Override
    public String getColor() {
        System.out.println("笔触颜色为蓝色");
        return color;
    }
}
