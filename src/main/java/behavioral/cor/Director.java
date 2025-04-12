package behavioral.cor;

/**
 * 主任类 充当具体处理者
 *
 * @author linexsong
 */
public class Director extends AbstractApprover {
    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        Integer amount = 50000;
        if (request.getAmount() < amount) {
            System.out.println(
                    "主任" + this.name + "审批采购单: " + request.getNumber() + ", 金额：" + request.getAmount() +
                    "元，采购目的: " + request.getPurpose());

            // 进行处理
            return;
        }

        this.successor.processRequest(request);
    }
}

