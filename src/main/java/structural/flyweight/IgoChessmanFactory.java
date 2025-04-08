package structural.flyweight;

import java.util.Hashtable;

/**
 * @author linexsong
 */
public class IgoChessmanFactory {
    private static final IgoChessmanFactory INSTANCE = new IgoChessmanFactory();
    private final Hashtable<String, BaseIgoChessman> tb;

    private IgoChessmanFactory() {
        tb = new Hashtable<>();
        tb.put("b", new BlackIgoChessman());
        tb.put("w", new WhiteIgoChessman());
    }

    public static IgoChessmanFactory getInstance() {
        return INSTANCE;
    }

    public BaseIgoChessman getIgoChessman(String color) {
        return tb.get(color);
    }
}
