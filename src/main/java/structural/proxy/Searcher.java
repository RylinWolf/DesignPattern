package structural.proxy;

/**
 * @author linexsong
 */
public interface Searcher {
    /**
     * 查询功能
     *
     * @param userId  用户 id
     * @param keyword 查询关键字
     * @return 查询结果
     */
    String doSearch(String userId, String keyword);
}
