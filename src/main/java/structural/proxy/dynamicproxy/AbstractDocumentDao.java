package structural.proxy.dynamicproxy;

/**
 * @author linexsong
 */
public interface AbstractDocumentDao {
    /**
     * 模拟业务方法：根据 ID 删除
     *
     * @param docId 文档 ID
     * @return bool
     */
    Boolean deleteBtId(String docId);
}
