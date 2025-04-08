package structural.flyweight;

/**
 * @author linexsong
 */
public abstract class BaseIgoChessman {
    /**
     * 获取棋子颜色
     *
     * @return 颜色字符串
     */
    public abstract String getColor();

    public void display(Coordinates coordinates) {
        System.out.println("棋子颜色: " + this.getColor() + ", 棋子位置: " + coordinates.getCoordinate());
    }
}
