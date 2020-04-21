package 생성패턴.factory_method.gof;

public abstract class Discount {
    public VendorId vendorId;

    public Discount(VendorId vendorId) {
        this.vendorId = vendorId;
    }

    public abstract int applyDiscount(int price);
    public abstract boolean isApplicable(int price);
    public abstract String toString();
}
