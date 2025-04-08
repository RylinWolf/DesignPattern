package structural.flyweight;

/**
 * @author linexsong
 */
public class IgoChessmanClient {
    public static void main(String[] args) {
        IgoChessmanFactory instance = IgoChessmanFactory.getInstance();
        // 基于享元模式创建的对象, 内存地址相同
        BaseIgoChessman w1 = instance.getIgoChessman("w");
        BaseIgoChessman w2 = instance.getIgoChessman("w");
        System.out.println(w1 == w2);
        w1.display(new Coordinates(1, 3));
        w2.display(new Coordinates(3, 6));
    }
}
