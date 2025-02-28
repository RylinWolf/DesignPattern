package creational.simplefactorypattern;

/**
 * 工厂类
 *
 * @author linexsong
 */
public class ChartFactory {
    public static Chart getChart(String type) {
        Chart chart;
        switch (type) {
            case "histogram" -> {
                chart = new HistogramChart();
                System.out.println("初始化柱状图");
            }
            case "pie" -> {
                chart = new PieChart();
                System.out.println("初始化饼图");
            }
            case "line" -> {
                chart = new LineChart();
                System.out.println("初始化折线图");
            }
            default -> chart = null;
        }
        return chart;
    }
}
