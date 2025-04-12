package behavioral.cor;

/**
 * @author linexsong
 */
public class VicePresident extends AbstractApprover {
    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        Integer amount = 10000;
        if (request.getAmount() < amount) {
            System.out.println(
                    "副董事长: " + this.name + "审批采购单：" + request.getNumber() + ", 金额: " + request.getAmount() +
                    "元，采购目的：" + request.getPurpose());

            return;
        }
        this.successor.processRequest(request);
    }
    
}
