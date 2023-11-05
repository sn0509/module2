package Voucher;

public class TenPercent implements BusinessStrategy{

    @Override
    public double DoDiscount(double price) {
        return price * 0.9;
    }
}
