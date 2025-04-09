package structural.proxy;

/**
 * @author linexsong
 */
public class AccessValidator {
    /**
     * 模拟用户验证
     *
     * @param userId id
     * @return bool
     */
    public boolean validate(String userId) {
        System.out.println("验证用户: " + userId);
        String allowUser = "123";
        if (allowUser.equals(userId)) {
            System.out.println("验证通过! ");
            return true;
        }
        System.out.println("验证失败！");
        return false;
    }
}
