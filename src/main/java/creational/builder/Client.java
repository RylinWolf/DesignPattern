package creational.builder;

import tools.XmlUtil;

/**
 * @author linexsong
 */
public class Client {
    public static void main(String[] args) {
        ActorController cont = new ActorController();
        var actor = cont.constructor(XmlUtil.getObject("/Volumes/Documents/Linex Documents/Projects/Java/DesignPattern/src/main/java/creational/builder/config.xml",
                "className", 0, AbstractActorBuilder.class));

        System.out.println("类型: " + actor.getType());
        System.out.println("脸型: " + actor.getFace());
        System.out.println("性别: " + actor.getSex());
        System.out.println("衣着: " + actor.getCostume());
        System.out.println("发型: " + actor.getHairstyle());
    }
}
