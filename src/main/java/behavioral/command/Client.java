package behavioral.command;

import tools.XmlUtil;

/**
 * @author linexsong
 */
public class Client {
    public static void main(String[] args) {
        FunctionButton button = new FunctionButton();

        button.setCommand(XmlUtil.getObject(
                "/Volumes/Documents/Linex Documents/Projects/Java/DesignPattern/src/main/java/behavioral/command/config.xml",
                "className", 0, AbstractCommand.class));

        button.click();
    }
}
