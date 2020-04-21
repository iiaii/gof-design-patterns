package 생성패턴.factory_method.gof;

public class OliveYoung extends Store {
    final VendorId vendorId = VendorId.OLIVEYOUNG;
    @Override
    public Discount createDiscount(DiscountId discountId) {
        switch(discountId) {
            case COUPON:
                return new Coupon(vendorId,0.2);
            case POINT:
                return new Point(vendorId, 1000);
        }
        return null;
    }
}
