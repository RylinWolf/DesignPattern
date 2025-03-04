package creational.singleton.lazy;

/**
 * @author linexsong
 */
public class LazySingleton {
    private static volatile LazySingleton singleton;
    private String text;

    private LazySingleton() {

    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    /**
     * 无锁状态，多线程可能导致多个实例出现。
     *
     * @return 实例
     */
    public static LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }

    /**
     * 使用 Synchronized 关键字对方法加锁，确保同时只有一个线程可访问。
     * <p>
     * 方法加锁会增加高并发时的性能浪费。
     *
     * @return 实例
     */
    synchronized public static LazySingleton getInstanceWithSynchronized() {
        return getInstance();
    }

    /**
     * 使用 synchronized 对 LazySingleton 加锁，保证同时只有一个线程会执行该静态方法
     * <p>
     * 如果某一瞬间两个线程同时调用了该方法，则一个线程 A 进入 synchronized 代码块，另一个线程 B 等待时，
     * B 线程并不知道实例已经被创建，此时 B 获得锁后会导致出现多个单例对象。
     *
     * @return 实例
     */
    public static LazySingleton getInstanceWithSynchronizedField() {
        if (singleton == null) {
            synchronized (LazySingleton.class) {
                singleton = new LazySingleton();
            }
        }
        return singleton;
    }

    /**
     * 使用双重检查锁定，保证线程获得锁时再次判断实例是否为空。
     * 此时，实例需要使用 volatile 关键字来保证线程的可见性。
     *
     * @return 实例
     */
    public static LazySingleton getInstanceWithDoubleCheckLocking() {
        if (singleton == null) {
            synchronized (LazySingleton.class) {
                if (singleton == null) {
                    singleton = new LazySingleton();
                }
            }
        }
        return singleton;
    }
}
