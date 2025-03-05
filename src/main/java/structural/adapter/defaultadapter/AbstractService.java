package structural.adapter.defaultadapter;

/**
 * 缺省适配器类，实现适配者接口，并实现对应的所有空方法
 *
 * @author linexsong
 */
public abstract class AbstractService implements ServiceInterface {
    @Override
    public void post() {

    }

    @Override
    public Object get() {
        return null;
    }

    @Override
    public Boolean update() {
        return null;
    }

    @Override
    public Boolean delete() {
        return null;
    }
}
