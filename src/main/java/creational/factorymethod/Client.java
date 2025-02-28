package creational.factorymethod;

import tools.XmlUtil;

import java.lang.reflect.InvocationTargetException;

/**
 * @author linexsong
 */
public class Client {
    public static void main(String[] args) {
        LoggerFactory factory;
        Logger logger;
        // 修改日志工厂需要修改客户端代码，违反了开闭原则
        /*
        factory = new FileLoggerFactory()
        logger = factory.createLogger()
        logger.writeLog()
         */
        String className = XmlUtil.getNodeString("/Volumes/Documents/Linex Documents/Projects/Java/DesignPattern/src/main/java/creational/factoryMethod/config.xml",
                "className", 0);
        assert className != null;

        Class<?> c;
        try {
            c = Class.forName(className);
            if (c.isAssignableFrom(LoggerFactory.class)) {
                throw new ClassCastException("类型" + c.getName() + "无法转换为 Logger");
            }
            factory = (LoggerFactory) c.getConstructor().newInstance();

        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        logger = factory.createLogger();
        logger.writeLog();


    }
}
