package structural.adapter.target;

/**
 * @author linexsong
 */
public abstract class AbstractCarController {
    /**
     * 汽车移动方法
     */
    public void move() {
        System.out.println("汽车移动!");
    }

    /**
     * 汽车发出声音
     */
    public abstract void phonate();

    /**
     * 汽车闪烁灯光
     */
    public abstract void twinkle();

}
