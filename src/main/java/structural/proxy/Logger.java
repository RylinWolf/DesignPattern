package structural.proxy;

/**
 * @author linexsong
 */
public class Logger {
    /**
     * 模拟日志记录
     *
     * @param userId id
     */
    public void log(String userId) {
        System.out.println("用户: " + userId + "查询次数加1");
    }
}
