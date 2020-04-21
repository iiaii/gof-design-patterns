package 생성패턴.factory_method.gof;

import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Store[] stores = {new OliveYoung(), new Lalavla()};
        List<Discount> discounts = getAllDiscounts(stores);
        discounts.forEach(d -> {
            System.out.println(d.toString()+" 10000원 물건에 적용시 -> "+d.applyDiscount(10000));
        });
    }

    public static List<Discount> getAllDiscounts(Store[] stores) {
        List<Discount> discounts = new LinkedList<>();
        for (Store store : stores) {
            for (DiscountId discountId : DiscountId.values()) {
                discounts.add(store.createDiscount(discountId));
            }
        }
        return discounts;
    }
}
