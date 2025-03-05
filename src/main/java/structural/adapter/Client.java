package structural.adapter;

import structural.adapter.target.AbstractCarController;
import tools.XmlUtil;

/**
 * @author linexsong
 */
public class Client {
    public static void main(String[] args) {
        AbstractCarController controller = XmlUtil.getObject("/Volumes/Documents/Linex Documents/Projects/Java/DesignPattern/src/main/java/structural/adapter/config.xml",
                "className", 0, AbstractCarController.class);

        controller.move();
        controller.twinkle();
        controller.phonate();
    }
}
