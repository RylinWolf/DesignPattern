package creational.simplefactorypattern;

/**
 * 具体产品类 - 折线图
 *
 * @author linexsong
 */
public class LineChart implements Chart {
    public LineChart() {
        System.out.println("创建折线图");
    }

    @Override
    public void display() {
        System.out.println("展示折线图");
    }
}
