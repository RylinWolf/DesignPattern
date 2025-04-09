package structural.proxy.dynamicproxy;

/**
 * @author linexsong
 */
public class UserDao implements AbstractUserDao {
    @Override
    public Boolean findById(String userId) {
        String id = "123";
        return id.equals(userId);
    }
}
