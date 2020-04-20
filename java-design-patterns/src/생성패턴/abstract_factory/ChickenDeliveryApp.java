package 생성패턴.abstract_factory;

public class ChickenDeliveryApp {
    public static ChickenPackage orderChickenPackage(VendorId vendorId) {
        ChickenStore chickenStore = null;
        switch (vendorId) {
            case BBQ:
                chickenStore = new BbqChickenStore();
                break;
            case BHC:
                chickenStore = new BhcChickenStore();
                break;
        }
        ChickenPackage chickenPackage = chickenStore.getChickenPackage();
        System.out.println(vendorId+" 치킨 배달 완료!");
        System.out.println("-----------------------");
        return chickenPackage;
    }
}
