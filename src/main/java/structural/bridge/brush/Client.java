package structural.bridge.brush;

/**
 * @author linexsong
 */
public class Client {
    public static void main(String[] args) {
        AbstractBrush brush = new HugeBrush();

        brush.setColor(new BrushColorRed());
        brush.write();

        brush.setColor(new BrushColorBlue());
        brush.write();
    }
}
