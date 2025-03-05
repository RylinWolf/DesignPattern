package structural.adapter.defaultadapter;

/**
 * 具体业务类，继承缺省适配器类，重写需要的方法
 *
 * @author linexsong
 */
public class ConcreteService extends AbstractService {
    /**
     * 仅重写需要的方法，无须为接口其他方法提供空的实现
     */
    @Override
    public void post() {
        System.out.println("发送请求");
    }
}
