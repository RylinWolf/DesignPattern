package creational.prototype.prototypemanager;

/**
 * @author linexsong
 */
public class PrototypeObj implements Cloneable {
    @Override
    public PrototypeObj clone() throws CloneNotSupportedException {
        return (PrototypeObj) super.clone();
    }
}
