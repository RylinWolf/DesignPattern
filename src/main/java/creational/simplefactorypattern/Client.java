package creational.simplefactorypattern;

import tools.XmlUtil;

/**
 * 客户端测试类
 * <p>
 *
 * @author linexsong
 */
public class Client {
    public static void main(String[] args) {
        // 需要修改客户端代码中静态工厂的参数来更改具体产品对象，违反了开闭原则。
        /*
        Chart chart
        chart = ChartFactory.getChart("histogram")
        chart.display()
        chart = ChartFactory.getChart("line")
        chart.display()
        chart = ChartFactory.getChart("pie")
        chart.display()
        */

        // 使用 XML 配置文件
        String chartType = XmlUtil.getNodeString("/Volumes/Documents/Linex Documents/Projects/Java/DesignPattern/src/main/java/creational/simplefactorypattern/config.xml", "chartType", 0);
        assert chartType != null;
        Chart chart = ChartFactory.getChart(chartType);
        chart.display();

    }
}
