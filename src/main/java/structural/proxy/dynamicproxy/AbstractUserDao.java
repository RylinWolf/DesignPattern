package structural.proxy.dynamicproxy;

/**
 * @author linexsong
 */
public interface AbstractUserDao {
    /**
     * 模拟业务方法：根据 ID 查询是否存在
     *
     * @param userId 用户Id
     * @return bool
     */
    Boolean findById(String userId);
}
