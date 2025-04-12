package behavioral.cor;

/**
 * @author linexsong
 */
public class PurchaseRequest {
    /** 采购金额 */
    private Double amount;

    /** 采购单编号 */
    private Integer number;

    /** 采购目的 */
    private String purpose;

    public PurchaseRequest(Double amount, Integer number, String purpose) {
        this.amount = amount;
        this.number = number;
        this.purpose = purpose;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
