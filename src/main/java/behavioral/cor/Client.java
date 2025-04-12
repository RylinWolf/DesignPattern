package behavioral.cor;

/**
 * @author linexsong
 */
public class Client {
    public static void main(String[] args) {
        AbstractApprover wang, zhang, lee, meeting;
        wang = new Director("王五");
        zhang = new VicePresident("张三");
        lee = new President("李一");
        meeting = new Congress("董事会");

        // 职责链
        wang.setApprover(zhang).setApprover(lee).setApprover(meeting);

        PurchaseRequest rq1 = new PurchaseRequest(45001d, 1, "买倚天剑");
        PurchaseRequest rq2 = new PurchaseRequest(60000d, 2, "购买葵花宝典");
        PurchaseRequest rq3 = new PurchaseRequest(160000d, 3, "购买九阴真经");
        PurchaseRequest rq4 = new PurchaseRequest(800000d, 4, "购买屠龙刀");

        wang.processRequest(rq1);
        wang.processRequest(rq2);
        wang.processRequest(rq3);
        wang.processRequest(rq4);
    }
}
