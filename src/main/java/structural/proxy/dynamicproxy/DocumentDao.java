package structural.proxy.dynamicproxy;

/**
 * @author linexsong
 */
public class DocumentDao implements AbstractDocumentDao {
    @Override
    public Boolean deleteBtId(String docId) {
        String id = "123";
        return id.equals(docId);
    }
}
