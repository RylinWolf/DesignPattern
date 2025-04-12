package behavioral.cor;

/**
 * @author linexsong
 */
public class President extends AbstractApprover {
    public President(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        Integer amount = 500000;
        if (request.getAmount() < amount) {
            System.out.println(
                    "董事长: " + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() +
                    "元，采购目的：" + request.getPurpose());
            return;
        }
        this.successor.processRequest(request);
    }
}
