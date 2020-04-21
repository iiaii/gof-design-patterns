package 생성패턴.factory_method.effective_java;

import 생성패턴.factory_method.gof.VendorId;

public class Coupon {
    private VendorId vendorId;
    private int discountRate;

    public Coupon(VendorId vendorId, int discountRate) {
        this.vendorId = vendorId;
        this.discountRate = discountRate;
    }

    public static Coupon newOliveYoungCoupon() {
        return new Coupon(VendorId.OLIVEYOUNG, 10);
    }

    public static Coupon newLalavlaCoupon() {
        return new Coupon(VendorId.LALAVLA, 20);
    }

    public int applyCoupon(int price) {
        return isApplicable(price) ? price-(price*discountRate/100) : price;
    }

    @Override
    public String toString() {
        return vendorId+" "+discountRate+"% 할인 쿠폰";
    }

    public boolean isApplicable(int price) {
        return price >= 10000;
    }
}
