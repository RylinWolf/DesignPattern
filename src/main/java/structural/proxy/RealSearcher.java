package structural.proxy;

/**
 * @author linexsong
 */
public class RealSearcher implements Searcher {
    @Override
    public String doSearch(String userId, String keyword) {
        System.out.println("用户 " + userId + " 使用关键词 " + keyword + "查询业务信息");
        return "具体内容";
    }
}
