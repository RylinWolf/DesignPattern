package structural.flyweight;

/**
 * @author linexsong
 */
public class Coordinates {
    private Integer x;
    private Integer y;

    public Coordinates() {
    }

    public Coordinates(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public void setCoordinate(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public String getCoordinate() {
        return x + "," + y;
    }
}
