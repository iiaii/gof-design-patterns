package 생성패턴.factory_method.gof;

public class Coupon extends Discount {
    public final int MAX_DISCOUNT = 5000;
    private double discountRate;

    public Coupon(VendorId vendorId, double discountRate) {
        super(vendorId);
        this.discountRate = discountRate;
    }

    @Override
    public int applyDiscount(int price) {
        return isApplicable(price) ? price-(int)Math.min(MAX_DISCOUNT,price*discountRate) : price;
    }

    @Override
    public boolean isApplicable(int price) {
        return price >= 10000;
    }

    @Override
    public String toString() {
        return vendorId+" "+(int)(discountRate*100)+"% 할인 쿠폰";
    }
}
