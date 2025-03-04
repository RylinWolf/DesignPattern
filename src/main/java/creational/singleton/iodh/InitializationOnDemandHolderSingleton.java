package creational.singleton.iodh;

/**
 * @author linexsong
 */
public class InitializationOnDemandHolderSingleton {
    /**
     * 静态内部类，用于创建单例对象
     */
    private static class Holder {
        private static final InitializationOnDemandHolderSingleton SINGLETON = new InitializationOnDemandHolderSingleton();
    }

    /**
     * 获取静态内部类中创建的单例对象
     *
     * @return 实例
     */
    public InitializationOnDemandHolderSingleton getInstance() {
        return Holder.SINGLETON;
    }
}
