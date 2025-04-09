package structural.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author linexsong
 */
public class Client {
    public static void main(String[] args) {
        // handler 方法调用处理器
        InvocationHandler handler;

        /*
        动态代理 userDao
         */
        AbstractUserDao userDao = new UserDao();

        // 初始化 handler 为 userDao 方法调用
        handler = new DaoLogHandler(userDao);

        // userDao 的动态代理对象
        AbstractUserDao proxy;
        proxy = (AbstractUserDao) Proxy.newProxyInstance(AbstractUserDao.class.getClassLoader(), new Class[]{AbstractUserDao.class}, handler);

        // 调用业务方法
        System.out.println(proxy.findById("123"));

        /*
        动态代理 docDao
         */
        AbstractDocumentDao docDao = new DocumentDao();

        // docDao 的动态代理对象
        AbstractDocumentDao docProxy;

        handler = new DaoLogHandler(docDao);
        docProxy = (AbstractDocumentDao) Proxy.newProxyInstance(AbstractDocumentDao.class.getClassLoader(), new Class[]{AbstractDocumentDao.class}, handler);
        System.out.println(docProxy.deleteBtId("123"));


    }
}
