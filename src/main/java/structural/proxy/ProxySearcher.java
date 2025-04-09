package structural.proxy;

/**
 * @author linexsong
 */
public class ProxySearcher implements Searcher {
    /**
     * 维护对真实主题角色的引用
     */
    private final RealSearcher searcher = new RealSearcher();
    private final AccessValidator validator = new AccessValidator();
    private final Logger logger = new Logger();

    @Override
    public String doSearch(String userId, String keyword) {
        // 执行身份验证
        if (!this.validate(userId)) {
            return null;
        }
        String res = searcher.doSearch(userId, keyword);
        // 记录日志
        this.log(userId);
        return res;
    }

    public boolean validate(String userId) {
        return validator.validate(userId);
    }

    public void log(String userId) {
        logger.log(userId);
    }
}
