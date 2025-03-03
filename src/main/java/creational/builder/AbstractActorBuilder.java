package creational.builder;

/**
 * @author linexsong
 */
public abstract class AbstractActorBuilder {
    protected Actor actor = new Actor();

    /**
     * 构造类型
     */
    public abstract void buildType();

    /**
     * 构造性别
     */
    public abstract void buildSex();

    /**
     * 构造脸型
     */
    public abstract void buildFace();

    /**
     * 构造服装
     */
    public abstract void buildCostume();

    /**
     * 构造发型
     */
    public abstract void buildHairstyle();

    /**
     * 工厂方法，返回一个完整的角色对象
     *
     * @return 构建好的角色
     */
    public Actor createActor() {
        return actor;
    }
}
