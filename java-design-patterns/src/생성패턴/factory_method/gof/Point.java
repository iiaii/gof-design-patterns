package 생성패턴.factory_method.gof;

public class Point extends Discount {
    private int point;

    public Point(VendorId vendorId, int point) {
        super(vendorId);
        this.point = point;
    }

    @Override
    public int applyDiscount(int price) {
        return isApplicable(price) ? price-point : price;
    }

    @Override
    public boolean isApplicable(int price) {
        return price >= 10000;
    }

    @Override
    public String toString() {
        return vendorId+" "+point+" 포인트";
    }
}
