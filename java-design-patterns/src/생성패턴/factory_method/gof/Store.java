package 생성패턴.factory_method.gof;

public abstract class Store {
    public abstract Discount createDiscount(DiscountId discountId);
}
