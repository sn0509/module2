package Voucher;

public class Voucher {
    private String name;
    private double price;
    private BusinessStrategy businessStrategy;

    public Voucher(BusinessStrategy businessStrategy) {
        this.businessStrategy = businessStrategy;
    }
    public Voucher(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BusinessStrategy getBusinessStrategy() {
        return businessStrategy;
    }

    public void setBusinessStrategy(BusinessStrategy businessStrategy) {
        this.businessStrategy = businessStrategy;
    }
}
