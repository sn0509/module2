package Voucher;

public class TwentyPercent implements BusinessStrategy{
    @Override
    public double DoDiscount (double price){
        return price * 0.8;
    }
}
