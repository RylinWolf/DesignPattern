package structural.facade.abstractfacade;

import tools.XmlUtil;

/**
 * @author linexsong
 */
public class EncryptClient {
    public static void main(String[] args) {
        String xml = "/Volumes/Documents/Linex Documents/Projects/Java/DesignPattern/src/main/java/structural/facade/abstractfacade/config.xml";
        AbstractEncryptFacade facade = XmlUtil.getObject(xml, "className", 0, AbstractEncryptFacade.class);

        facade.fileEncrypt("./src/main/java/structural/facade/abstractfacade/output/1.txt",
                "./src/main/java/structural/facade/abstractfacade/output/des.txt");
    }
}
