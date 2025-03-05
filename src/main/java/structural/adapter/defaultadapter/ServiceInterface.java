package structural.adapter.defaultadapter;

/**
 * 接口类，提供大量方法
 *
 * @author linexsong
 */
public interface ServiceInterface {
    /**
     * 演示方法 post
     */
    void post();

    /**
     * 演示方法 get
     *
     * @return obj
     */
    Object get();

    /**
     * 演示方法 update
     *
     * @return bool
     */
    Boolean update();

    /**
     * 演示方法 delete
     *
     * @return bool
     */
    Boolean delete();
}
