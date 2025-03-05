package structural.bridge.img;

import structural.bridge.img.abstraction.AbstractImage;
import structural.bridge.img.implementor.ImageImp;
import tools.XmlUtil;

/**
 * @author linexsong
 */
public class Client {
    public static void main(String[] args) {
        String xml = "/Volumes/Documents/Linex Documents/Projects/Java/DesignPattern/src/main/java/structural/bridge/config.xml";

        AbstractImage abstractImage = XmlUtil.getObject(xml, "refinedAbstract", 0, AbstractImage.class);
        ImageImp imageImp = XmlUtil.getObject(xml, "concreteImplementor", 0, ImageImp.class);

        abstractImage.setImageImp(imageImp);
        abstractImage.parseFile("abc.gif");
    }
}
