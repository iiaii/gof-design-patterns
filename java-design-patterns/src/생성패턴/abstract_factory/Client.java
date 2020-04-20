package 생성패턴.abstract_factory;

public class Client {
    public static void main(String[] args) {
        ChickenPackage bhcChickenPackage = ChickenDeliveryApp.orderChickenPackage(VendorId.BHC);
        eat(bhcChickenPackage.getChicken());
        eat(bhcChickenPackage.getPickledRadishes());
        eat(bhcChickenPackage.getSoda());

        ChickenPackage bbqChickenPackage = ChickenDeliveryApp.orderChickenPackage(VendorId.BBQ);
        eat(bbqChickenPackage.getChicken());
        eat(bbqChickenPackage.getPickledRadishes());
        eat(bbqChickenPackage.getSoda());
    }

    public static void eat(Eatable eatable) {
        System.out.println(eatable.toString()+" 을(를) 먹습니다");
        System.out.println("(소리) "+eatable.eatingSound());
        System.out.println("-----------------------");
    }
}
