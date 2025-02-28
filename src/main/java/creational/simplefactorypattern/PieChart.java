package creational.simplefactorypattern;

/**
 * 具体产品类 - 饼图
 *
 * @author linexsong
 */
public class PieChart implements Chart {
    public PieChart() {
        System.out.println("创建饼图");
    }

    @Override
    public void display() {
        System.out.println("展示饼图");
    }
}
