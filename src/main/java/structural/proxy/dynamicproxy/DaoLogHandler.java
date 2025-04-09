package structural.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.time.LocalDateTime;

/**
 * @author linexsong
 */
public class DaoLogHandler implements InvocationHandler {
    private Object obj;

    public DaoLogHandler() {
    }

    public DaoLogHandler(Object obj) {
        this.obj = obj;
    }

    private void beforeHandler() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("调用时间: " + now.getYear() + now.getMonthValue() + now.getDayOfMonth()
                + now.getHour() + now.getMinute() + now.getSecond() + now.getNano());
    }

    private void afterHandler() {
        System.out.println("调用结束");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeHandler();
        Object res = method.invoke(obj, args);
        afterHandler();
        return res;
    }


}
