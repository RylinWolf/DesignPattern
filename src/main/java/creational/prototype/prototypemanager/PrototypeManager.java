package creational.prototype.prototypemanager;

import java.util.Hashtable;

/**
 * 原型对象管理器示例
 *
 * @author linexsong
 */
public class PrototypeManager {
    private final Hashtable<String, PrototypeObj> prototypeTable = new Hashtable<>();

    public void add(String k, PrototypeObj obj) {
        prototypeTable.put(k, obj);
    }

    public PrototypeObj get(String k) throws CloneNotSupportedException {
        return prototypeTable.get(k).clone();
    }
}
