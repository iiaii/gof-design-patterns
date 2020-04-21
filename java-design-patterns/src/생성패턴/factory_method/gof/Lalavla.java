package 생성패턴.factory_method.gof;

public class Lalavla extends Store {
    final VendorId vendorId = VendorId.LALAVLA;
    @Override
    public Discount createDiscount(DiscountId discountId) {
        switch(discountId) {
            case COUPON:
                return new Coupon(vendorId, 0.3);
            case POINT:
                return new Point(vendorId,500);
        }
        return null;
    }
}
