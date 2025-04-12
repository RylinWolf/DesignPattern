package behavioral.cor;

/**
 * @author linexsong
 */
public abstract class AbstractApprover {
    /** 定义后继对象 */
    protected AbstractApprover successor;

    /** 审批者姓名 */
    protected String name;

    public AbstractApprover(String name) {
        this.name = name;
    }

    public AbstractApprover setApprover(AbstractApprover successor) {
        this.successor = successor;
        return successor;
    }

    /**
     * 抽象请求方法
     *
     * @param request 请求对象
     */
    public abstract void processRequest(PurchaseRequest request);
}
