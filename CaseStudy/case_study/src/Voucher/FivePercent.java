package Voucher;

public class FivePercent implements BusinessStrategy{
    @Override
    public double DoDiscount(double price) {
        return price * 0.95;
    }
}
