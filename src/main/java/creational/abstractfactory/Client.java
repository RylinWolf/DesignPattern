package creational.abstractfactory;

import tools.XmlUtil;

/**
 * @author linexsong
 */
public class Client {
    public static void main(String[] args) {
        SkinFactory factory = XmlUtil.getObject("/Volumes/Documents/Linex Documents/Projects/Java/DesignPattern/src/main/java/creational/abstractfactory/config.xml",
                "className", 0, SkinFactory.class);
        factory.createButton().display();
        factory.createComboBox().display();
        factory.createTextField().display();

    }
}
